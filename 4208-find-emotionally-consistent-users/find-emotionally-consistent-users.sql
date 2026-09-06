# Write your MySQL query statement below
WITH ReactionCounts AS (
    SELECT 
        user_id,
        reaction AS dominant_reaction,
        COUNT(*) AS reaction_count,
        SUM(COUNT(*)) OVER(PARTITION BY user_id) AS total_reactions
    FROM reactions
    GROUP BY user_id, reaction
),
RankedReactions AS (
    SELECT 
        user_id,
        dominant_reaction,
        ROUND(CAST(reaction_count AS DECIMAL(5,2)) / total_reactions, 2) AS reaction_ratio,
        total_reactions,
        ROW_NUMBER() OVER(PARTITION BY user_id ORDER BY reaction_count DESC, dominant_reaction ASC) as rn
    FROM ReactionCounts
    WHERE total_reactions >= 5
)
SELECT 
    user_id,
    dominant_reaction,
    reaction_ratio
FROM RankedReactions
WHERE rn = 1 AND reaction_ratio >= 0.60
ORDER BY reaction_ratio DESC, user_id ASC;
