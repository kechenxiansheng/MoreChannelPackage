package com.cm.mcp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.cm.mcp.BuildConfig;

/**
 * 多渠道打包测试
 * import com.cm.mcp.BuildConfig;
 * 注：BuildConfig报错可忽略，不顺眼就 make project 一下
 */
public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MCP_TAG";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        StringBuilder sb = new StringBuilder();
        if(BuildConfig.DEBUG){
            sb.append("当前是debug包").append("\n");
        }else {
            sb.append("当前是release包").append("\n");
        }
        sb.append("渠道：").append(BuildConfig.CHANNEL_KEY).append("\n")
                .append("包名：").append(BuildConfig.APPLICATION_ID).append("\n")
                .append("versionCode：").append(BuildConfig.VERSION_CODE).append("\n")
                .append("versionName：").append(BuildConfig.VERSION_NAME).append("\n")

        ;

        TextView desText = findViewById(R.id.desText);
        desText.setText(sb.toString());


    }
}