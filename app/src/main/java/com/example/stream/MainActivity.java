package com.example.stream;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.stream.model.Video;
import com.example.stream.util.VideoAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView mVideosListView;
    private List<Video> mVideosList = new ArrayList<>();
    private VideoAdapter mVideoAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //assign video
        mVideosListView = (ListView) findViewById(R.id.videoListView);

        //create videos
        Video earthVideo = new Video("https://s3-ap-southeast-1.amazonaws.com/videostreaming-deployments-mobilehub-169249611/HLS/earth-1523747414400/earth-master-playlist.m3u8", "Earth");
        Video movieVideo = new Video("https://s3-ap-southeast-1.amazonaws.com/videostreaming-deployments-mobilehub-169249611/HLS/movie-1523747392861/movie-master-playlist.m3u8", "Movie");
        Video smallVideo = new Video("https://s3-ap-southeast-1.amazonaws.com/videostreaming-deployments-mobilehub-169249611/HLS/small-1523747393740/small-master-playlist.m3u8", "Small");
        Video wildlifeVideo = new Video("https://s3-ap-southeast-1.amazonaws.com/videostreaming-deployments-mobilehub-169249611/HLS/wildlife-1523747393804/wildlife-master-playlist.m3u8", "Wildlife");
       // Video parkVideo = new Video("https://s3.amazonaws.com/androidvideostutorial/862014834.mp4");
       // Video busyCityVideo = new Video("https://s3.amazonaws.com/androidvideostutorial/862017385.mp4");

        mVideosList.add(earthVideo);
        mVideosList.add(movieVideo);
        mVideosList.add(smallVideo);
        mVideosList.add(wildlifeVideo);
       // mVideosList.add(parkVideo);
       // mVideosList.add(busyCityVideo);

        /***populate video list to adapter**/
        mVideoAdapter = new VideoAdapter(this, mVideosList);
        mVideosListView.setAdapter(mVideoAdapter);
    }
}