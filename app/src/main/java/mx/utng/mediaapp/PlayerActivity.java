package mx.utng.mediaapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.VideoView;

public class PlayerActivity extends Activity implements PlayerControlsFragment.PlayerControlsListener {
    private VideoView mVideoView;
    private Video mVideo;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);
        //Cambios -No
        mVideoView = (VideoView) findViewById( R.id.video_view );
        mVideo = (Video) getIntent().getSerializableExtra( VideoDetailsFragment.
                EXTRA_VIDEO );
        mVideoView.setVideoPath( mVideo.getVideoUrl() );
        //Cambios -No

        initViews();
        initVideoPlayer();
    }

    private void initViews() {
        mVideoView = (VideoView) findViewById( R.id.video_view );
    }

    private void initVideoPlayer() {
        mVideo = (Video) getIntent().getSerializableExtra( VideoDetailsFragment.EXTRA_VIDEO );
        mVideoView.setVideoPath( mVideo.getVideoUrl() );
    }

    @Override
    public void play() {
        mVideoView.start();
    }

    @Override
    public void pause() {
        mVideoView.pause();
    }
}
