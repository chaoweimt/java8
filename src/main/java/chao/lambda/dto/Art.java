package chao.lambda.dto;

/**
 * @author alex on 2018/6/14.
 * 创作音乐的个人或团队
 */
public class Art {
    /**
     * 艺术家的名字(例如“甲壳虫乐队”)
     */
    private String name;

    /**
     * 乐队成员(例如“约翰 · 列侬”)，该字段可为空。
     */
    private String members;

    /**
     * 乐队来自哪里(例如“利物浦”)。
     */
    private String origin;

    /**
     * 专辑中的一支曲目
     */
    private Track track;

    /**
     * 专辑，由若干曲目组成。
     */
    private Album album;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMembers() {
        return members;
    }

    public void setMembers(String members) {
        this.members = members;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public Track getTrack() {
        return track;
    }

    public void setTrack(Track track) {
        this.track = track;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }
}
