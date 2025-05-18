package com.code.Codecommands;

import static net.minecraft.server.command.CommandManager.*;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.fabricmc.fabric.api.command.v2.*;
import net.minecraft.command.argument.EntityArgumentType;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;

public class codecommands {
    @SuppressWarnings("unused")
    public static void Registry_Commands() {
        CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> dispatcher.register(literal("find").requires(source -> source.hasPermissionLevel(2)).then(argument("player", EntityArgumentType.player())).executes(context -> {
            try {
                ServerPlayerEntity player = EntityArgumentType.getPlayer(context, "player");
                ServerCommandSource source = context.getSource();
                source.sendFeedback(() -> Text.literal("Player %s at %d %d %d".formatted(player.getName(), player.getBlockX(), player.getBlockY(), player.getBlockZ())), false);
            } catch (CommandSyntaxException e) {
                e.printStackTrace();
            }
            return 1;
        })));
    }
}