package checkpoint.spring.remote.service;

import checkpoint.spring.remote.entity.Comment;
import checkpoint.spring.remote.entity.Feed;
import checkpoint.spring.remote.entity.User;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import checkpoint.spring.remote.repository.FeedRepository;

@Service
public class FeedService {
    @Autowired
    private FeedRepository feedRepository;

    public Feed addFeed(Feed feed) {

        List<Comment> comments = feed.getComments();
        for (Comment comment : comments) {
            comment.setFeeds(feed);
        }
        return feedRepository.save(feed);
    }

    public List<Feed> getFeeds() {

        return feedRepository.findAll();

    }

    public Feed getFeedById(Long feedId) {
        Optional<Feed> feed = feedRepository.findById(feedId);

        if (feed.isPresent()) {
            return feed.get();
        } else {
            throw new IllegalArgumentException("feed not found with id: " + feedId);
        }
    }

    public Feed updateFeed(Long feedId, Feed feed) {
        Optional<Feed> retrievedFeed = feedRepository.findById(feedId);
        if (retrievedFeed.isPresent()) {
            Feed updateFeed = retrievedFeed.get();
            updateFeed.setMessage(feed.getMessage());
            updateFeed.setImageUrl(feed.getImageUrl());
            return feedRepository.save(updateFeed);
        } else {
            throw new IllegalArgumentException("Feed not found with id: " + feedId);
        }
    }

    public void deleteFeed(Long id) {
        feedRepository.deleteById(id);
    }
}
