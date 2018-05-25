import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

import java.util.List;

public class Main {

    public static void main(String[] args) throws TwitterException {

        ConfigurationBuilder cf = new ConfigurationBuilder();

        cf.setDebugEnabled(true)
                .setOAuthConsumerKey("5YODYbsZFHfR9CS5Mrs8Md4Lg")
                .setOAuthConsumerSecret("YTateFIwm9nCWqD6hEPHlLS1Yy3NSlk2w4fnP8brUEITf6ctz2")
                .setOAuthAccessToken("999928336381108225-T1OJx2LcKxAQ6cDp56N9R3L22BYeEHS")
                .setOAuthAccessTokenSecret("vpKfcj4zyXdWH4zbp0GmdCRlhayYEaQYXZ5SeoW9NpIsa");

        TwitterFactory tf = new TwitterFactory(cf.build());
        twitter4j.Twitter twitter = tf.getInstance();

        twitter.getHomeTimeline();

        // get userName, status

        List <Status> status = twitter.getHomeTimeline();

        for (Status st:status) {
            System.out.println(st.getUser().getName()+"--------"+st.getText());
        }


    }
}
