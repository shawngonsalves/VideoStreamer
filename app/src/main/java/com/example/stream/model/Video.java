package com.example.stream.model;

public class Video {

    private String videoUrl;
    private String videoName;

    public Video(String videoUrl, String videoName) {
        this.videoUrl = videoUrl;
        this.videoName = videoName;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoUrl) {
        this.videoName = videoName;
    }
}