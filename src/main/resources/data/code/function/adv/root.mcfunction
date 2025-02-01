#开始时初始Buff
effect give @s minecraft:saturation 1500 0 true
effect give @s minecraft:resistance 210 2 true
effect give @s minecraft:regeneration 60 0 true
attribute @s minecraft:generic.jump_strength base set 0
attribute @s minecraft:generic.movement_speed base set 0
#attribute @s minecraft:generic.movement_speed base set 0.10000000149011612
#attribute @s minecraft:generic.jump_strength base set 0.41999998688697815
#创建记分项
scoreboard objectives add plants dummy
scoreboard players set @s plants 0
scoreboard players set #$%^& plants 1000