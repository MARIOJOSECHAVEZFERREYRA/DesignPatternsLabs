import org.example.LabsTP.LabN2.proxy.CacheProxyYouTubeApiClient;
import org.example.LabsTP.LabN2.proxy.YouTubeVideoDownloader;
import org.junit.jupiter.api.Test;

public class ProxyTest {

    private void call(YouTubeVideoDownloader downloader) {
        downloader.renderPopularVideos();
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderPopularVideos();
        downloader.renderVideoPage("dancesvideoo");
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderVideoPage("someothervid");
    }

    @Test
    public void main() {

        YouTubeVideoDownloader smartDownloader = new YouTubeVideoDownloader(new CacheProxyYouTubeApiClient());
        call(smartDownloader);

    }
}
