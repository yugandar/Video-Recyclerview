package app.goa.com.videorecyclerview;

/**
 * Created by Tofiq Quadri on 27-03-2017.
 */

public class YoutubeVideo {

    String videoUrl;

    public YoutubeVideo() {

    }

    public YoutubeVideo(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }
}
