package chao.lambda.dto;

/**
 * @author alex on 2018/6/14.
 * 专辑，由若干曲目组成。
 */

public class Album {


    /**
     * 专辑名(例如《左轮手枪》)。

     */
    private String name;

    /**
     * 专辑上所有曲目的列表。
     */
    private String tracks;

    /**
     * 参与创作本专辑的艺术家列表。
     */
    private String musicians;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTracks() {
        return tracks;
    }

    public void setTracks(String tracks) {
        this.tracks = tracks;
    }

    public String getMusicians() {
        return musicians;
    }

    public void setMusicians(String musicians) {
        this.musicians = musicians;
    }
}
