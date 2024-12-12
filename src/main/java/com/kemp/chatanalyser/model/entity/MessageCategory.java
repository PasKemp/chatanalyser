package com.kemp.chatanalyser.model.entity;


import lombok.Getter;

@Getter
public enum MessageCategory {

    TEXT (1, "Text"),
    VIDEO_CALL(2, "Video call"),
    PICTURE (3, "Picture"),
    VIDEO (4, "Video"),
    STICKER (5, "Sticker"),
    MEMO (6, "Memo"),
    POLL (7, "Poll"),
    GIF (8, "Gif"),
    LOCATION (9, "Location"),
    DELETED (10, "Deleted"),
    DEFAULT (11, "Default"),;

    private final int id;
    private final String name;

    MessageCategory(final int id, final String name) {
        this.id = id;
        this.name = name;
    }

    public static MessageCategory getByText(final String identifier) {
        return switch (identifier) {
            case "Verpasster Videoanruf.", "Videoanruf Gestartet" -> MessageCategory.VIDEO_CALL;
            case "Bild weggelassen" -> MessageCategory.PICTURE;
            case "Audio weggelassen" -> MessageCategory.MEMO;
            case "Video weggelassen" -> MessageCategory.VIDEO;
            case "GIF weggelassen" -> MessageCategory.GIF;
            case "Sticker weggelassen" -> MessageCategory.STICKER;
            case "UMFRAGE" -> MessageCategory.POLL;
            case "Standort:" -> MessageCategory.LOCATION;
            case "Diese Nachricht wurde gelöscht." -> MessageCategory.DELETED;
            default -> MessageCategory.DEFAULT;
        };
    }

}
