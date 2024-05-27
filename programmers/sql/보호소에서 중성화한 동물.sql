SELECT
    ai.ANIMAL_ID,
    ai.ANIMAL_TYPE,
    ai.NAME
FROM
    ANIMAL_INS ai
        JOIN ANIMAL_outs ao ON
            ai.animal_id = ao.animal_id
WHERE
    ai.SEX_UPON_INTAKE != ao.SEX_UPON_OUTCOME