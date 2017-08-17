/*
 * Copyright (c) 2016 riebie, Kippers <https://bitbucket.org/Kippers/mcclans-core-sponge>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package nl.riebie.mcclans.messages;

import nl.riebie.mcclans.clan.ClanImpl;
import nl.riebie.mcclans.player.ClanPlayerImpl;
import nl.riebie.mcclans.utils.Utils;
import org.spongepowered.api.Sponge;
import org.spongepowered.api.command.CommandSource;
import org.spongepowered.api.text.Text;
import org.spongepowered.api.text.format.TextColor;
import org.spongepowered.api.text.format.TextColors;

/**
 * Created by Kippers on 12-1-2016.
 */
public class Messages {

    public static final String FOR_ALL_COMMANDS_TYPE_CLAN_HELP = "Для получения списка команд, напишите /clan help";
    public static final String CLAN_TAG_EXISTS_ALREADY = "Тэг клана уже присутствует";
    public static final String CLAN_TAG_BLOCKED = "Этот тэг запрещён. Выберите другой";
    public static final String CLAN_NAME_BLOCKED = "Такое название запрещено. Выберите другое";
    public static final String YOU_ARE_ALREADY_IN_A_CLAN = "Вы уже в клане";
    public static final String CLAN_DOES_NOT_EXIST = "Клан не существует";
    public static final String YOU_ARE_NOT_IN_A_CLAN = "Вы не в клане";
    public static final String RANK_DOES_NOT_EXIST = "Ранг не существует";
    public static final String RANK_IS_NOT_CHANGEABLE = "Ранг нельзя изменить";
    public static final String PLAYER_DOES_NOT_EXIST = "Игрок не существует";
    public static final String YOU_CANNOT_RESIGN_FROM_THE_CLAN_AS_THE_OWNER = "Вы не можете покинуть клан пока вы его основатель. Отдайте своё звание другому игроку";
    public static final String YOU_CANNOT_OVERWRITE_THE_OWNER_RANK = "You cannot overwrite the Owner rank. The Owner needs to transfer his rank to another clan member first";
    public static final String ONLY_THE_OWNER_CAN_CHANGE_OWNER = "Это доступно только главе клана";

    public static final String NO_PENDING_CLAN_INVITE = "У вас нет приглашений";
    public static final String CLAN_INVITE_ACCEPTED = "Приглашение в клан принято";
    public static final String CLAN_INVITE_DECLINED = "Приглашение в клан отклонено";
    public static final String NO_PENDING_ALLY_INVITE = "Нет союзных предложений";
    public static final String ALLY_INVITE_ACCEPTED = "Союз принят";
    public static final String ALLY_INVITE_DECLINED = "Союз отклонён";
    public static final String YOU_CANNOT_REMOVE_THE_OWNER_FROM_THE_CLAN = "Вы не можете изгнать главу клана";
    public static final String THIS_CLAN_IS_NOT_ACCEPTING_ALLY_INVITES = "Клан не принимает запросы на альянс";
    public static final String YOUR_CLANS_ARE_ALREADY_ALLIES = "Ваши кланы уже в союзе";
    public static final String THIS_CLAN_IS_NOT_AN_ALLY = "Этот клан не состоит в альянсе с вами";
    public static final String YOU_CANNOT_BECOME_ALLIES_WITH_YOUR_OWN_CLAN = "Вы не можете стать союзником.. своего.. клана.. ЧЁ??";
    public static final String THIS_IS_NOT_A_VALID_COLOR = "This is not a valid color";
    public static final String YOUR_CLAN_NO_LONGER_ACCEPTS_ALLY_INVITES = "Ваш клан больше не принимает запросы на альянс";
    public static final String YOUR_CLAN_NOW_ACCEPTS_ALLY_INVITES = "Ваш клан теперь принимает запросы на альянс";
    public static final String CLAN_HOME_LOCATION_SET = "Установлена точка дома для клана";
    public static final String CLAN_HOME_LOCATION_IS_NOT_SET = "Точка дома для клана, не установлена";
    public static final String NO_TABLE_TO_BROWSE = "You must execute a pageable command first";
    public static final String TELEPORT_CANCELLED = "Телепорт отменён";
    public static final String YOU_NEED_TO_MOVE_BEFORE_ATTEMPTING_ANOTHER_TELEPORT = "You need to move before attempting another teleport";
    public static final String PLAYER_PROPERTIES_REMOVED = "Player properties removed";
    public static final String THESE_ARE_THE_SAME_PLAYERS = "These are the same players";
    public static final String FRIENDLY_FIRE_IS_OFF = "Включена защита от PvP между участниками клана";
    public static final String ACTIVATED_PERSONAL_FRIENDLY_FIRE_PROTECTION = "Активирована защита от PvP между участниками клана";
    public static final String DEACTIVATED_PERSONAL_FRIENDLY_FIRE_PROTECTION = "Отключена защита от PvP между участниками клана";
    public static final String PLAYER_STATISTICS_SUCCESSFULLY_MODIFIED = "Player statistics successfully modified";
    public static final String ECONOMY_USAGE_IS_CURRENTLY_DISABLED = "Economy usage is currently disabled";
    public static final String NO_ECONOMY_ACCOUNT_FOUND = "No economy account found!";
    public static final String YOU_ARE_NOW_IGNORING_CLAN_CHAT = "Вы начали игнорировать чат клана";
    public static final String YOU_HAVE_STOPPED_IGNORING_CLAN_CHAT = "Вы разблокировали чат клана";
    public static final String YOU_ARE_NOW_IGNORING_ALLY_CHAT = "Вы заблокировали чат альянса";
    public static final String YOU_HAVE_STOPPED_IGNORING_ALLY_CHAT = "Вы разблокировали чат альянса";
    public static final String YOU_ARE_NOW_SPYING_ON_ALL_CLAN_CHATS = "You are now spying on all clan chats";
    public static final String YOU_HAVE_STOPPED_SPYING_ON_ALL_CLAN_CHATS = "You have stopped spying on all clan chats";

    public static final String YOU_DO_NOT_HAVE_PERMISSION_TO_USE_THIS_COMMAND = "У вас нет прав на выполнение этой команды";
    public static final String THIS_COMMAND_HAS_NO_INFORMATION_TO_DISPLAY = "Команда не содержит информации";
    public static final String PAGE_DOES_NOT_EXIST = "Страница не существует";
    public static final String YOU_NEED_TO_BE_A_PLAYER_TO_PERFORM_THIS_COMMAND = "You need to be a player to use this command";
    public static final String YOU_NEED_TO_BE_A_MEMBER_OF_A_CLAN_TO_PERFORM_THIS_COMMAND = "Вы должны состоять в клане";
    public static final String CONFIGURATION_RELOADED = "Configuration reloaded";
    public static final String SYSTEM_BACKUP_INITIATED = "System backup initiated";

    public static final TextColor BASIC_CHAT_COLOR = TextColors.DARK_GREEN;
    public static final TextColor WARNING_CHAT_COLOR = TextColors.RED;
    public static final TextColor BASIC_HIGHLIGHT = TextColors.GREEN;
    public static final TextColor WARNING_HIGHLIGHT = TextColors.WHITE;

    // Use when providing basic feedback to the commandSender
    public static void sendBasicMessage(CommandSource commandSource, String message) {
        commandSource.sendMessage(Text.builder(message).color(BASIC_CHAT_COLOR).build());
    }

    // Use when sending error feedback about the used command to the commandSender
    public static void sendWarningMessage(CommandSource commandSource, String message) {
        commandSource.sendMessage(Text.builder(message).color(WARNING_CHAT_COLOR).build());
    }

    // Used for asynchronous
    public static Text getWarningMessage(String message) {
        return Text.builder(message).color(WARNING_CHAT_COLOR).build();
    }

    public static void sendBroadcastMessage(String message) {
        Sponge.getServer().getBroadcastChannel().send(Text.of(message));
    }

    public static void sendBroadcastMessageClanCreatedBy(String clanName, Text coloredClanTag, String creator) {
        Text message = Text.join(
                Text.builder("Клан ").color(BASIC_CHAT_COLOR).build(),
                coloredClanTag,
                Text.builder(" " + clanName).color(BASIC_HIGHLIGHT).build(),
                Text.builder(" создан игроком ").color(BASIC_CHAT_COLOR).build(),
                Text.builder(creator).color(BASIC_HIGHLIGHT).build()
        );
        Sponge.getServer().getBroadcastChannel().send(message);
    }

    public static void sendBroadcastMessageClanDisbandedBy(String clanName, Text coloredClanTag, String disbander) {
        Text message = Text.join(
                Text.builder("Клан ").color(BASIC_CHAT_COLOR).build(),
                coloredClanTag,
                Text.builder(" " + clanName).color(BASIC_HIGHLIGHT).build(),
                Text.builder(" распущен игроком ").color(BASIC_CHAT_COLOR).build(),
                Text.builder(disbander).color(BASIC_HIGHLIGHT).build()
        );
        Sponge.getServer().getBroadcastChannel().send(message);
    }

    public static void sendClanBroadcastMessageClanFriendlyFireProtectionHasBeenActivatedByPlayer(ClanImpl clan, String playerName) {
        Text message = Text.join(
                Text.builder("Защита от PvP между участниками клана включена игроком ").color(BASIC_CHAT_COLOR).build(),
                Text.builder(playerName).color(BASIC_HIGHLIGHT).build()
        );
        clan.sendMessage(message);
    }

    public static void sendClanBroadcastMessageClanFriendlyFireProtectionHasBeenDeactivatedByPlayer(ClanImpl clan, String playerName) {
        Text message = Text.join(
                Text.builder("Защита от PvP между участниками клана отключена игроком ").color(BASIC_CHAT_COLOR).build(),
                Text.builder(playerName).color(BASIC_HIGHLIGHT).build()
        );
        clan.sendMessage(message);
    }

    public static void sendClanBroadcastMessagePlayerResignedFromTheClan(ClanImpl clan, String playerName) {
        Text message = Text.join(
                Text.builder("Игрок ").color(BASIC_CHAT_COLOR).build(),
                Text.builder(playerName).color(BASIC_HIGHLIGHT).build(),
                Text.builder(" покинул клан").color(BASIC_CHAT_COLOR).build()
        );
        clan.sendMessage(message);
    }

    public static void sendClanBroadcastMessagePlayerRemovedFromTheClanBy(ClanImpl clan, String playerName, String removerPlayer) {
        Text message = Text.join(
                Text.builder("Игрок ").color(BASIC_CHAT_COLOR).build(),
                Text.builder(playerName).color(BASIC_HIGHLIGHT).build(),
                Text.builder(" изгнан из клана игроком ").color(BASIC_CHAT_COLOR).build(),
                Text.builder(removerPlayer).color(BASIC_HIGHLIGHT).build()
        );
        clan.sendMessage(message);
    }

    public static void sendClanBroadcastMessagePlayerJoinedTheClan(ClanImpl clan, String playerName) {
        Text message = Text.join(
                Text.builder("Игрок ").color(BASIC_CHAT_COLOR).build(),
                Text.builder(playerName).color(BASIC_HIGHLIGHT).build(),
                Text.builder(" присоединился к клану").color(BASIC_CHAT_COLOR).build()
        );
        clan.sendMessage(message);
    }

    public static void sendClanBroadcastMessagePlayerDeclinedClanInvite(ClanImpl clan, String playerName, String permission) {
        Text message = Text.join(
                Text.builder("Игрок ").color(BASIC_CHAT_COLOR).build(),
                Text.builder(playerName).color(BASIC_HIGHLIGHT).build(),
                Text.builder(" отклонил приглашение в клан").color(BASIC_CHAT_COLOR).build()
        );
        clan.sendMessage(permission, message);
    }

    public static void sendClanBroadcastMessagePlayerInvitedToTheClan(ClanImpl clan, String playerName, String inviterName, String permission) {
        Text message = Text.join(
                Text.builder("Игрок ").color(BASIC_CHAT_COLOR).build(),
                Text.builder(playerName).color(BASIC_HIGHLIGHT).build(),
                Text.builder(" был приглашён в клан игроком ").color(BASIC_CHAT_COLOR).build(),
                Text.builder(inviterName).color(BASIC_HIGHLIGHT).build()
        );
        clan.sendMessage(permission, message);
    }

    public static void sendClanBroadcastMessageClanHasBeenInvitedToBecomeAlliesBy(ClanImpl clan, String clanName, String inviterName,
                                                                                  String permission) {
        Text message = Text.join(
                Text.builder("Клан ").color(BASIC_CHAT_COLOR).build(),
                Text.builder(clanName).color(BASIC_HIGHLIGHT).build(),
                Text.builder(" получил заявку на союз от игрока ").color(BASIC_CHAT_COLOR).build(),
                Text.builder(inviterName).color(BASIC_HIGHLIGHT).build()
        );
        clan.sendMessage(permission, message);
    }

    public static void sendClanBroadcastMessageClanHasDeclinedToBecomeAllies(ClanImpl clan, String clanName, String permission) {
        Text message = Text.join(
                Text.builder("Клан ").color(BASIC_CHAT_COLOR).build(),
                Text.builder(clanName).color(BASIC_HIGHLIGHT).build(),
                Text.builder(" отклонил вашу заявку на союз").color(BASIC_CHAT_COLOR).build()
        );
        clan.sendMessage(permission, message);
    }

    public static void sendClanBroadcastMessagePlayerHasDeclinedToBecomeAlliesWithClan(ClanImpl clan, String playerName, String clanName,
                                                                                       String permission) {
        Text message = Text.join(
                Text.builder("Игрок ").color(BASIC_CHAT_COLOR).build(),
                Text.builder(playerName).color(BASIC_HIGHLIGHT).build(),
                Text.builder(" отклонил союзничество с ").color(BASIC_CHAT_COLOR).build(),
                Text.builder(clanName).color(BASIC_HIGHLIGHT).build()
        );
        clan.sendMessage(permission, message);
    }

    public static void sendClanBroadcastMessageYourClanHasBeenInvitedToBecomeAlliesWithClan(ClanImpl clan, String clanName, Text coloredClanTag,
                                                                                            String permission) {
        Text message1 = Text.of("");
        Text message2 = Text.join(
                Text.builder("Ваш клан был приглашен стать союзником ").color(BASIC_CHAT_COLOR).build(),
                coloredClanTag,
                Text.builder(" " + clanName).color(BASIC_HIGHLIGHT).build()
        );
        Text message3 = Text.join(
                Text.builder("Чтобы принять - ").color(BASIC_CHAT_COLOR).build(),
                Text.builder("/clan ally accept").color(BASIC_HIGHLIGHT).build(),
                Text.builder(" чтобы отклонить - ").color(BASIC_CHAT_COLOR).build(),
                Text.builder("/clan ally decline").color(BASIC_HIGHLIGHT).build()
        );
        clan.sendMessage(permission, message1, message2, message3);
    }

    public static void sendYourClanHasBeenInvitedToBecomeAlliesWithClan(ClanPlayerImpl clanPlayer, String clanName, Text coloredClanTag) {
        Text message1 = Text.of("");
        Text message2 = Text.join(
                Text.builder("Ваш клан был приглашен стать союзником ").color(BASIC_CHAT_COLOR).build(),
                coloredClanTag,
                Text.builder(" " + clanName).color(BASIC_HIGHLIGHT).build()
        );
        Text message3 = Text.join(
                Text.builder("Чтобы принять - ").color(BASIC_CHAT_COLOR).build(),
                Text.builder("/clan ally accept").color(BASIC_HIGHLIGHT).build(),
                Text.builder(" чтобы отклонить - ").color(BASIC_CHAT_COLOR).build(),
                Text.builder("/clan ally decline").color(BASIC_HIGHLIGHT).build()
        );
        clanPlayer.sendMessage(Text.of(message1, message2, message3));
    }

    public static void sendClanBroadcastMessageYourClanHasBecomeAlliesWithClan(ClanImpl clan, String allyClanName) {
        Text message = Text.join(
                Text.builder("Вы теперь в союзе с ").color(BASIC_CHAT_COLOR).build(),
                Text.builder(allyClanName).color(BASIC_HIGHLIGHT).build()
        );
        clan.sendMessage(message);
    }

    public static void sendClanBroadcastMessagePlayerHasEndedTheAllianceWithClan(ClanImpl clan, String playerName, String allyClanName) {
        Text message = Text.join(
                Text.builder("Игрок ").color(BASIC_CHAT_COLOR).build(),
                Text.builder(playerName).color(BASIC_HIGHLIGHT).build(),
                Text.builder(" прекратил союз с ").color(BASIC_CHAT_COLOR).build(),
                Text.builder(allyClanName).color(BASIC_HIGHLIGHT).build()
        );
        clan.sendMessage(message);
    }

    public static void sendClanBroadcastMessageClanHasEndedTheAllianceWithYourClan(ClanImpl clan, String allyClanName) {
        Text message = Text.join(
                Text.builder("Клан ").color(BASIC_CHAT_COLOR).build(),
                Text.builder(allyClanName).color(BASIC_HIGHLIGHT).build(),
                Text.builder(" прекратил союз с вашим кланом").color(BASIC_CHAT_COLOR).build()
        );
        clan.sendMessage(message);
    }

    public static void sendYouHaveBeenRemovedFromClan(ClanPlayerImpl clanPlayer, String clanName) {
        Text message = Text.join(
                Text.builder("Вас изгнали из клана ").color(BASIC_CHAT_COLOR).build(),
                Text.builder(clanName).color(BASIC_HIGHLIGHT).build()
        );
        clanPlayer.sendMessage(message);
    }

    public static void sendRankSuccessfullyCreated(CommandSource commandSource, String rankName) {
        Text message = Text.join(
                Text.builder("Ранг ").color(BASIC_CHAT_COLOR).build(),
                Text.builder(rankName).color(BASIC_HIGHLIGHT).build(),
                Text.builder(" успешно создан").color(BASIC_CHAT_COLOR).build()
        );
        commandSource.sendMessage(message);
    }

    public static void sendRankSuccessfullyModified(CommandSource commandSource, String rankName) {
        Text message = Text.join(
                Text.builder("Ранг ").color(BASIC_CHAT_COLOR).build(),
                Text.builder(rankName).color(BASIC_HIGHLIGHT).build(),
                Text.builder(" изменён").color(BASIC_CHAT_COLOR).build()
        );
        commandSource.sendMessage(message);
    }

    public static void sendInvitedToClan(CommandSource commandSource, String clanName, Text coloredClanTag) {
        commandSource.sendMessages(
                Text.of(""),
                Text.join(
                        Text.builder("Вас пригласили в клан ").color(BASIC_CHAT_COLOR).build(),
                        coloredClanTag,
                        Text.builder(" " + clanName).color(BASIC_HIGHLIGHT).build()
                ),
                Text.join(
                        Text.builder("Чтобы принять напишите: ").color(BASIC_CHAT_COLOR).build(),
                        Text.builder("/clan accept").color(BASIC_HIGHLIGHT).build(),
                        Text.builder(" чтобы отклонить: ").color(BASIC_CHAT_COLOR).build(),
                        Text.builder("/clan decline").color(BASIC_HIGHLIGHT).build()
                )
        );
    }

    public static void sendAddingPermissionFailedNotAValidPermission(CommandSource commandSource, String pcode) {
        Text message = Text.join(
                Text.builder("Добавлено право ").color(WARNING_CHAT_COLOR).build(),
                Text.builder(pcode).color(WARNING_HIGHLIGHT).build(),
                Text.builder(" failed: Not a valid permission ").color(WARNING_CHAT_COLOR).build()
        );
        commandSource.sendMessage(message);
    }

    public static void sendRemovingPermissionFailedNotAValidPermission(CommandSource commandSource, String pcode) {
        Text message = Text.join(
                Text.builder("Удалено право ").color(WARNING_CHAT_COLOR).build(),
                Text.builder(pcode).color(WARNING_HIGHLIGHT).build(),
                Text.builder(" failed: Not a valid permission ").color(WARNING_CHAT_COLOR).build()
        );
        commandSource.sendMessage(message);
    }

    public static void sendAddingPermissionFailedRankAlreadyHasThisPermission(CommandSource commandSource, String pcode) {
        Text message = Text.join(
                Text.builder("Adding permission ").color(WARNING_CHAT_COLOR).build(),
                Text.builder(pcode).color(WARNING_HIGHLIGHT).build(),
                Text.builder(" failed: Rank already has this permission").color(WARNING_CHAT_COLOR).build()
        );
        commandSource.sendMessage(message);
    }

    public static void sendRemovingPermissionFailedRankDoesNotHaveThisPermission(CommandSource commandSource, String pcode) {
        Text message = Text.join(
                Text.builder("Removing permission ").color(WARNING_CHAT_COLOR).build(),
                Text.builder(pcode).color(WARNING_HIGHLIGHT).build(),
                Text.builder(" failed: Rank does not have this permission").color(WARNING_CHAT_COLOR).build()
        );
        commandSource.sendMessage(message);
    }

    public static void sendSuccessfullySetThisPermission(CommandSource commandSource, String pcode) {
        Text message = Text.join(
                Text.builder("Право установлено ").color(BASIC_CHAT_COLOR).build(),
                Text.builder(pcode).color(BASIC_HIGHLIGHT).build()
        );
        commandSource.sendMessage(message);
    }

    public static void sendSuccessfullyAddedThisPermission(CommandSource commandSource, String pcode) {
        Text message = Text.join(
                Text.builder("Право добавлено ").color(BASIC_CHAT_COLOR).build(),
                Text.builder(pcode).color(BASIC_HIGHLIGHT).build()
        );
        commandSource.sendMessage(message);
    }

    public static void sendSuccessfullyRemovedThisPermission(CommandSource commandSource, String pcode) {
        Text message = Text.join(
                Text.builder("Successfully removed permission ").color(BASIC_CHAT_COLOR).build(),
                Text.builder(pcode).color(BASIC_HIGHLIGHT).build()
        );
        commandSource.sendMessage(message);
    }

    public static void sendRankExistsAlready(CommandSource commandSource, String rankName) {
        Text message = Text.join(
                Text.builder("Ранг ").color(WARNING_CHAT_COLOR).build(),
                Text.builder(rankName).color(WARNING_HIGHLIGHT).build(),
                Text.builder(" уже существует").color(WARNING_CHAT_COLOR).build()
        );
        commandSource.sendMessage(message);
    }

    public static void sendRankSuccessfullyRenamed(CommandSource commandSource, String rankName, String newRankName) {
        Text message = Text.join(
                Text.builder("Ранг ").color(BASIC_CHAT_COLOR).build(),
                Text.builder(rankName).color(BASIC_HIGHLIGHT).build(),
                Text.builder(" переименован в ").color(BASIC_CHAT_COLOR).build(),
                Text.builder(newRankName).color(BASIC_HIGHLIGHT).build()
        );
        commandSource.sendMessage(message);
    }

    public static void sendRankRemoved(CommandSource commandSource, String rankName) {
        Text message = Text.join(
                Text.builder("Ранг ").color(BASIC_CHAT_COLOR).build(),
                Text.builder(rankName).color(BASIC_HIGHLIGHT).build(),
                Text.builder(" удалён").color(BASIC_CHAT_COLOR).build()
        );
        commandSource.sendMessage(message);
    }

    public static void sendPlayerAlreadyInClan(CommandSource commandSource, String playerName) {
        Text message = Text.join(
                Text.builder("Игрок ").color(WARNING_CHAT_COLOR).build(),
                Text.builder(playerName).color(WARNING_HIGHLIGHT).build(),
                Text.builder(" уже состоит в клане").color(WARNING_CHAT_COLOR).build()
        );
        commandSource.sendMessage(message);
    }

    public static void sendPlayerAlreadyInvitedByAnotherClan(CommandSource commandSource, String playerName) {
        Text message = Text.join(
                Text.builder("Игрок ").color(WARNING_CHAT_COLOR).build(),
                Text.builder(playerName).color(WARNING_HIGHLIGHT).build(),
                Text.builder(" приглашён в другой клан").color(WARNING_CHAT_COLOR).build()
        );
        commandSource.sendMessage(message);
    }

    public static void sendPlayerNotOnline(CommandSource commandSource, String playerName) {
        Text message = Text.join(
                Text.builder("Игрок ").color(WARNING_CHAT_COLOR).build(),
                Text.builder(playerName).color(WARNING_HIGHLIGHT).build(),
                Text.builder(" не в сети").color(WARNING_CHAT_COLOR).build()
        );
        commandSource.sendMessage(message);
    }

    public static void sendRankOfPlayerSuccessfullyChangedToRank(CommandSource commandSource, String playerName, String rankName) {
        Text message = Text.join(
                Text.builder("Ранг игрока ").color(BASIC_CHAT_COLOR).build(),
                Text.builder(playerName).color(BASIC_HIGHLIGHT).build(),
                Text.builder(" изменён на ").color(BASIC_CHAT_COLOR).build(),
                Text.builder(rankName).color(BASIC_HIGHLIGHT).build()
        );
        commandSource.sendMessage(message);
    }

    public static Text getYourRankHasBeenChangedToRank(String rankName) {
        return Text.join(
                Text.builder("Ваш ранг изменён на ").color(BASIC_CHAT_COLOR).build(),
                Text.builder(rankName).color(BASIC_HIGHLIGHT).build()
        );
    }

    public static void sendPlayerNotAMemberOfThisClan(CommandSource commandSource, String playerName) {
        Text message = Text.join(
                Text.builder("Игрок ").color(WARNING_CHAT_COLOR).build(),
                Text.builder(playerName).color(WARNING_HIGHLIGHT).build(),
                Text.builder(" не состоит в клане").color(WARNING_CHAT_COLOR).build()
        );
        commandSource.sendMessage(message);
    }

    public static void sendSuccessfullyResignedFromClan(CommandSource commandSource, String clanName) {
        Text message = Text.join(
                Text.builder("Вы покинули клан ").color(BASIC_CHAT_COLOR).build(),
                Text.builder(clanName).color(BASIC_HIGHLIGHT).build()
        );
        commandSource.sendMessage(message);
    }

    public static void sendThisClanHasAlreadyBeenInvitedToBecomeAlliesWithClan(CommandSource commandSource, String otherInvitingClan) {
        Text message = Text.join(
                Text.builder("Клан уже приглашен стать союзником с ").color(WARNING_CHAT_COLOR).build(),
                Text.builder(otherInvitingClan).color(WARNING_HIGHLIGHT).build(),
                Text.builder(". Повторите попытку после их ответа на другое приглашение").color(WARNING_CHAT_COLOR).build()
        );
        commandSource.sendMessage(message);
    }

    public static void sendSuccessfullyChangedTheClanTagColorTo(CommandSource commandSource, Text coloredClanTag) {
        Text message = Text.join(
                Text.builder("Цвет названия изменён на ").color(BASIC_CHAT_COLOR).build(),
                coloredClanTag
        );
        commandSource.sendMessage(message);
    }

    public static void sendNowTalkingInGlobal(CommandSource commandSource) {
        Text message = Text.join(
                Text.builder("[").color(TextColors.GRAY).build(),
                Text.builder("G").color(TextColors.WHITE).build(),
                Text.builder("] ").color(TextColors.GRAY).build(),
                Text.builder("Вы пишете в глобал").color(BASIC_CHAT_COLOR).build()
        );
        commandSource.sendMessage(message);
    }

    public static void sendNowTalkingInClanChat(CommandSource commandSource) {
        Text message = Text.join(
                Text.builder("[").color(TextColors.GRAY).build(),
                Text.builder("Клановый").color(TextColors.YELLOW).build(),
                Text.builder("] ").color(TextColors.GRAY).build(),
                Text.builder("Вы пишете в клановый чат").color(BASIC_CHAT_COLOR).build()
        );
        commandSource.sendMessage(message);
    }

    public static void sendNowTalkingInAllyChat(CommandSource commandSource) {
        Text message = Text.join(
                Text.builder("[").color(TextColors.GRAY).build(),
                Text.builder("Альянс").color(TextColors.GOLD).build(),
                Text.builder("] ").color(TextColors.GRAY).build(),
                Text.builder("Вы пишете в чат альянса").color(BASIC_CHAT_COLOR).build()
        );
        commandSource.sendMessage(message);
    }

    public static void sendYouNeedToUnignoreClanChatBeforeTalking(CommandSource commandSource) {
        Text message = Text.join(
                Text.builder("Чтобы написать в этот чат, нужно разблокировать его. Используйте ").color(WARNING_CHAT_COLOR).build(),
                Text.builder("/clan chat ignore clan").color(WARNING_HIGHLIGHT).build()
        );
        commandSource.sendMessage(message);
    }

    public static void sendYouNeedToUnignoreAllyChatBeforeTalking(CommandSource commandSource) {
        Text message = Text.join(
                Text.builder("Чтобы написать в этот чат, нужно разблокировать его. Используйте ").color(WARNING_CHAT_COLOR).build(),
                Text.builder("/clan chat ignore ally").color(WARNING_HIGHLIGHT).build()
        );
        commandSource.sendMessage(message);
    }

    public static void sendYouWereChargedCurrency(CommandSource commandSource, double price, String currencyName) {
        Text message = Text.join(
                Text.builder("С вашего баланса сняли ").color(BASIC_CHAT_COLOR).build(),
                Text.builder(String.valueOf(price)).color(BASIC_HIGHLIGHT).build(),
                Text.builder(" " + currencyName).color(BASIC_CHAT_COLOR).build()
        );
        commandSource.sendMessage(message);
    }

    public static void sendYouDoNotHaveEnoughCurrency(CommandSource commandSource, double price, String currencyName) {
        Text message = Text.join(
                Text.builder("У вас нету ").color(WARNING_CHAT_COLOR).build(),
                Text.builder(String.valueOf(price)).color(WARNING_HIGHLIGHT).build(),
                Text.builder(" " + currencyName).color(WARNING_CHAT_COLOR).build()
        );
        commandSource.sendMessage(message);
    }

    public static void sendNotEnoughCurrencyOnClanBank(CommandSource commandSource, double price, String currencyName) {
        Text message = Text.join(
                Text.builder("В казне клана нету ").color(WARNING_CHAT_COLOR).build(),
                Text.builder(String.valueOf(price)).color(WARNING_HIGHLIGHT).build(),
                Text.builder(" " + currencyName).color(WARNING_CHAT_COLOR).build()
        );
        commandSource.sendMessage(message);
    }

    public static void sendClanBankBalance(CommandSource commandSource, double balance, String currencyName) {
        Text message = Text.join(
                Text.builder("Баланс клана: ").color(BASIC_CHAT_COLOR).build(),
                Text.builder(String.valueOf(balance)).color(BASIC_HIGHLIGHT).build(),
                Text.builder(" " + currencyName).color(BASIC_CHAT_COLOR).build()
        );
        commandSource.sendMessage(message);
    }

    public static void sendClanBroadcastMessageDepositedInClanBank(ClanImpl clan, String playerName, CommandSource commandSource, double amount, String currencyName) {
        Text message = Text.join(
                Text.builder("Игрока ").color(BASIC_CHAT_COLOR).build(),
                Text.builder(playerName).color(BASIC_HIGHLIGHT).build(),
                Text.builder(" вложил ").color(BASIC_CHAT_COLOR).build(),
                Text.builder(String.valueOf(amount)).color(BASIC_HIGHLIGHT).build(),
                Text.builder(" " + currencyName + " в казну банка").color(BASIC_CHAT_COLOR).build()
        );
        clan.sendMessage(message);
    }

    public static void sendClanBroadcastMessageWithdrewFromClanBank(ClanImpl clan, String playerName, CommandSource commandSource, double amount, String currencyName) {
        Text message = Text.join(
                Text.builder("Игрок ").color(BASIC_CHAT_COLOR).build(),
                Text.builder(playerName).color(BASIC_HIGHLIGHT).build(),
                Text.builder(" взял ").color(BASIC_CHAT_COLOR).build(),
                Text.builder(String.valueOf(amount)).color(BASIC_HIGHLIGHT).build(),
                Text.builder(" " + currencyName + " из казны банка").color(BASIC_CHAT_COLOR).build()
        );
        clan.sendMessage(message);
    }

    public static void sendTeleportingInXSeconds(CommandSource commandSource, int seconds) {
        Text message = Text.join(
                Text.builder("Телепортация через ").color(BASIC_CHAT_COLOR).build(),
                Text.builder(String.valueOf(seconds)).color(BASIC_HIGHLIGHT).build(),
                Text.of(" "),
                Text.builder((seconds == 1) ? "секунду" : "секунд").color(BASIC_CHAT_COLOR).build()
        );
        commandSource.sendMessage(message);
    }

    public static void sendYouCanTeleportInXSeconds(CommandSource commandSource, int seconds) {
        Text message = Text.join(
                Text.builder("Вы телепортируетесь через ").color(WARNING_CHAT_COLOR).build(),
                Text.builder(String.valueOf(seconds)).color(WARNING_HIGHLIGHT).build(),
                Text.of(" "),
                Text.builder((seconds == 1) ? "секунду" : "секунд").color(WARNING_CHAT_COLOR).build()
        );
        commandSource.sendMessage(message);
    }

    public static void sendCannotSetClanhomeForAnotherXTime(CommandSource commandSource, long time) {
        Text message = Text.join(
                Text.builder("Нельзя изменить точку дома в течении ").color(WARNING_CHAT_COLOR).build(),
                Utils.formatTime(time, WARNING_CHAT_COLOR, WARNING_HIGHLIGHT)
        );
        commandSource.sendMessage(message);
    }

    public static void sendAllPlayerPropertiesTransferredFromPlayerToPlayer(CommandSource commandSource, String oldPlayerName, String newPlayerName) {
        Text message = Text.join(
                Text.builder("All player properties transferred from ").color(BASIC_CHAT_COLOR).build(),
                Text.builder(oldPlayerName).color(BASIC_HIGHLIGHT).build(),
                Text.builder(" to ").color(BASIC_CHAT_COLOR).build(),
                Text.builder(newPlayerName).color(BASIC_HIGHLIGHT).build()
        );
        commandSource.sendMessage(message);
    }

    public static void sendYouDoNotHaveTheRequiredPermission(CommandSource commandSource, String permission) {
        Text message = Text.join(
                Text.builder("Вам нужно иметь разрешение: ").color(WARNING_CHAT_COLOR).build(),
                Text.builder(permission).color(WARNING_HIGHLIGHT).build()
        );
        commandSource.sendMessage(message);

    }

    public static void sendFailedToExecuteCommandParameterContainsIllegalCharacters(CommandSource commandSource, String parameter) {
        commandSource.sendMessages(
                Text.builder("Не получилось выполнить команду").color(WARNING_CHAT_COLOR).build(),
                Text.join(
                        Text.builder("Параметр ").color(WARNING_CHAT_COLOR).build(),
                        Text.builder(parameter).color(WARNING_HIGHLIGHT).build(),
                        Text.builder(" содержит недопустимые символы").color(WARNING_CHAT_COLOR).build()
                )
        );
    }

    public static void sendPlayerHasAClanPlayerPleaseRemoveThisFirst(CommandSource commandSource, String playerName) {
        Text message = Text.join(
                Text.builder("Player ").color(WARNING_CHAT_COLOR).build(),
                Text.builder(playerName).color(WARNING_HIGHLIGHT).build(),
                Text.builder(" has a ClanPlayer. Please remove the old ClanPlayer before transferring this name to the target ClanPlayer").color(WARNING_CHAT_COLOR).build()
        );
        commandSource.sendMessage(message);
    }
}
