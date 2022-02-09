package domain;

public class Post {
    private int id; //Идентификатор записи
    private int ownerId; // Идентификатор владельца стены
    private int fromId; // Идентификатор автора записи
    private String LogoUrl; //Логотип
    private int date; // Время публикации записи
    private String imageUrl; // ссылка на картинку
    private String videoUrl; // ссылка на видео
    private String text; // Текст записи.
    private int isPinned; // Информация о том, что запись закреплена.
    private CommentsInfo commentsInfo; //Информация о комментариях к записи.
    private int signerId; // Идентификатор автора, если запись была опубликована от имени сообщества и подписана пользователем;
    private int replyOwnerId; // Идентификатор владельца записи, в ответ на которую была оставлена текущая.
    private int replyPostId; // Идентификатор записи, в ответ на которую была оставлена текущая.
    private LikesInfo likesInfo; // Информация о лайках к записи
    private RepostsInfo repostsInfo; // Информация о репостах записи
    private ViewsInfo viewsInfo; //Информация о просмотрах записи.
    private GeoInfo geoInfo; // Информация о местоположении
    private boolean friendsOnly; //1, если запись была создана с опцией «Только для друзей».
    private boolean markedAsAds; //Информация о том, содержит ли запись отметку «реклама» (1 — да, 0 — нет).
    private boolean canEdit; // Информация о том, может ли текущий пользователь редактировать запись (1 — может, 0 — не может).
    private boolean canDelete; // Информация о том, может ли текущий пользователь удалить запись (1 — может, 0 — не может).
    private boolean canPin; // Информация о том, может ли текущий пользователь закрепить запись (1 — может, 0 — не может).

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public int getFromId() {
        return fromId;
    }

    public void setFromId(int fromId) {
        this.fromId = fromId;
    }

    public String getLogoUrl() {
        return LogoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        LogoUrl = logoUrl;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getIsPinned() {
        return isPinned;
    }

    public void setIsPinned(int isPinned) {
        this.isPinned = isPinned;
    }

    public CommentsInfo getCommentsInfo() {
        return commentsInfo;
    }

    public void setCommentsInfo(CommentsInfo commentsInfo) {
        this.commentsInfo = commentsInfo;
    }

    public int getSignerId() {
        return signerId;
    }

    public void setSignerId(int signerId) {
        this.signerId = signerId;
    }

    public int getReplyOwnerId() {
        return replyOwnerId;
    }

    public void setReplyOwnerId(int replyOwnerId) {
        this.replyOwnerId = replyOwnerId;
    }

    public int getReplyPostId() {
        return replyPostId;
    }

    public void setReplyPostId(int replyPostId) {
        this.replyPostId = replyPostId;
    }

    public LikesInfo getLikesInfo() {
        return likesInfo;
    }

    public void setLikesInfo(LikesInfo likesInfo) {
        this.likesInfo = likesInfo;
    }

    public RepostsInfo getRepostsInfo() {
        return repostsInfo;
    }

    public void setRepostsInfo(RepostsInfo repostsInfo) {
        this.repostsInfo = repostsInfo;
    }

    public ViewsInfo getViewsInfo() {
        return viewsInfo;
    }

    public void setViewsInfo(ViewsInfo viewsInfo) {
        this.viewsInfo = viewsInfo;
    }

    public GeoInfo getGeoInfo() {
        return geoInfo;
    }

    public void setGeoInfo(GeoInfo geoInfo) {
        this.geoInfo = geoInfo;
    }

    public boolean isFriendsOnly() {
        return friendsOnly;
    }

    public void setFriendsOnly(boolean friendsOnly) {
        this.friendsOnly = friendsOnly;
    }

    public boolean isMarkedAsAds() {
        return markedAsAds;
    }

    public void setMarkedAsAds(boolean markedAsAds) {
        this.markedAsAds = markedAsAds;
    }

    public boolean isCanEdit() {
        return canEdit;
    }

    public void setCanEdit(boolean canEdit) {
        this.canEdit = canEdit;
    }

    public boolean isCanDelete() {
        return canDelete;
    }

    public void setCanDelete(boolean canDelete) {
        this.canDelete = canDelete;
    }

    public boolean isCanPin() {
        return canPin;
    }

    public void setCanPin(boolean canPin) {
        this.canPin = canPin;
    }
}
