package checkpoint.spring.remote.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import checkpoint.spring.remote.entity.Feed;
import checkpoint.spring.remote.entity.User;
import checkpoint.spring.remote.service.FeedService;
import checkpoint.spring.remote.service.UserService;
import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/posts")
public class FeedController {
    @Autowired
    private FeedService feedService;

    @Operation(summary = "Create feed", description = "Create feed")
    @PostMapping("/create")
    public ResponseEntity<Feed> createFeed(@RequestBody Feed feed) {
        feedService.addFeed(feed);
        return ResponseEntity.ok(feed);
    }

    @Operation(summary = "Get all feeds", description = "Get all feeds")
    @GetMapping("")
    public ResponseEntity<List<Feed>> getAllFeeds() {
        List<Feed> getFeeds = feedService.getFeeds();
        return ResponseEntity.ok(getFeeds);
    }

    @Operation(summary = "Get feed by id", description = "Get feed by id")
    @GetMapping("/{feedId}")
    public ResponseEntity<Feed> getUserById(@PathVariable Long feedId) {
        Feed feed = feedService.getFeedById(feedId);
        return ResponseEntity.ok(feed);
    }

    @Operation(summary = "Update feed", description = "Update feed by id")
    @PutMapping("/{feedId}")
    public ResponseEntity<Feed> updateFeed(@PathVariable Long feedId, @RequestBody Feed feed) {
        Feed updatedFeed = feedService.updateFeed(feedId, feed);
        return ResponseEntity.ok(updatedFeed);
    }

    @Operation(summary = "Delete feed", description = "Delete feed")
    @DeleteMapping("/{id}")
    public void deleteFeed(@PathVariable Long id) {
        this.feedService.deleteFeed(id);
    }
}
