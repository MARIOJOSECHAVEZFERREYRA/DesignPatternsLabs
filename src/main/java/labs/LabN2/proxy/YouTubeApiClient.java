package org.example.LabsTP.LabN2.proxy;

import java.util.Map;

public interface YouTubeApiClient {
    Map<String, Video> popularVideos();

    Video getVideo(String videoId);
}
