execute if score @s plants < #$%^& plants run scoreboard players add @s plants 1
execute if score @s plants < #$%^& plants run advancement revoke @s only code:main/tree/sapling/0004-pre-inf
execute if score @s plants = #$%^& plants run advancement grant @s only code:main/tree/sapling/0004-inf
title @s actionbar {"score":{"name":"*","objective":"plants"}}