package app.model;

/**
 * Created by ThinhDT on 12/7/16.
 * Copyright (c) 2016 Rai and Rohl Technologies, Inc. All rights reserved.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class News {

    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("feed")
    @Expose
    private Feed feed;
    @SerializedName("items")
    @Expose
    private List<Item> items = null;

    /**
     *
     * @return
     * The status
     */
    public String getStatus() {
        return status;
    }

    /**
     *
     * @param status
     * The status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     *
     * @return
     * The feed
     */
    public Feed getFeed() {
        return feed;
    }

    /**
     *
     * @param feed
     * The feed
     */
    public void setFeed(Feed feed) {
        this.feed = feed;
    }

    /**
     *
     * @return
     * The items
     */
    public List<Item> getItems() {
        return items;
    }

    /**
     *
     * @param items
     * The items
     */
    public void setItems(List<Item> items) {
        this.items = items;
    }

    public class Enclosure {

        @SerializedName("thumbnail")
        @Expose
        private String thumbnail;

        /**
         *
         * @return
         * The thumbnail
         */
        public String getThumbnail() {
            return thumbnail;
        }

        /**
         *
         * @param thumbnail
         * The thumbnail
         */
        public void setThumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
        }

    }

    public class Item {

        @SerializedName("title")
        @Expose
        private String title;
        @SerializedName("pubDate")
        @Expose
        private String pubDate;
        @SerializedName("link")
        @Expose
        private String link;
        @SerializedName("guid")
        @Expose
        private String guid;
        @SerializedName("author")
        @Expose
        private String author;
        @SerializedName("thumbnail")
        @Expose
        private String thumbnail;
        @SerializedName("description")
        @Expose
        private String description;
        @SerializedName("content")
        @Expose
        private String content;
        @SerializedName("enclosure")
        @Expose
        private Enclosure enclosure;
        @SerializedName("categories")
        @Expose
        private List<Object> categories = null;

        /**
         *
         * @return
         * The title
         */
        public String getTitle() {
            return title;
        }

        /**
         *
         * @param title
         * The title
         */
        public void setTitle(String title) {
            this.title = title;
        }

        /**
         *
         * @return
         * The pubDate
         */
        public String getPubDate() {
            return pubDate;
        }

        /**
         *
         * @param pubDate
         * The pubDate
         */
        public void setPubDate(String pubDate) {
            this.pubDate = pubDate;
        }

        /**
         *
         * @return
         * The link
         */
        public String getLink() {
            return link;
        }

        /**
         *
         * @param link
         * The link
         */
        public void setLink(String link) {
            this.link = link;
        }

        /**
         *
         * @return
         * The guid
         */
        public String getGuid() {
            return guid;
        }

        /**
         *
         * @param guid
         * The guid
         */
        public void setGuid(String guid) {
            this.guid = guid;
        }

        /**
         *
         * @return
         * The author
         */
        public String getAuthor() {
            return author;
        }

        /**
         *
         * @param author
         * The author
         */
        public void setAuthor(String author) {
            this.author = author;
        }

        /**
         *
         * @return
         * The thumbnail
         */
        public String getThumbnail() {
            return thumbnail;
        }

        /**
         *
         * @param thumbnail
         * The thumbnail
         */
        public void setThumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
        }

        /**
         *
         * @return
         * The description
         */
        public String getDescription() {
            return description;
        }

        /**
         *
         * @param description
         * The description
         */
        public void setDescription(String description) {
            this.description = description;
        }

        /**
         *
         * @return
         * The content
         */
        public String getContent() {
            return content;
        }

        /**
         *
         * @param content
         * The content
         */
        public void setContent(String content) {
            this.content = content;
        }

        /**
         *
         * @return
         * The enclosure
         */
        public Enclosure getEnclosure() {
            return enclosure;
        }

        /**
         *
         * @param enclosure
         * The enclosure
         */
        public void setEnclosure(Enclosure enclosure) {
            this.enclosure = enclosure;
        }

        /**
         *
         * @return
         * The categories
         */
        public List<Object> getCategories() {
            return categories;
        }

        /**
         *
         * @param categories
         * The categories
         */
        public void setCategories(List<Object> categories) {
            this.categories = categories;
        }

    }

    public class Feed {

        @SerializedName("url")
        @Expose
        private String url;
        @SerializedName("title")
        @Expose
        private String title;
        @SerializedName("link")
        @Expose
        private String link;
        @SerializedName("author")
        @Expose
        private String author;
        @SerializedName("description")
        @Expose
        private String description;
        @SerializedName("image")
        @Expose
        private String image;

        /**
         *
         * @return
         * The url
         */
        public String getUrl() {
            return url;
        }

        /**
         *
         * @param url
         * The url
         */
        public void setUrl(String url) {
            this.url = url;
        }

        /**
         *
         * @return
         * The title
         */
        public String getTitle() {
            return title;
        }

        /**
         *
         * @param title
         * The title
         */
        public void setTitle(String title) {
            this.title = title;
        }

        /**
         *
         * @return
         * The link
         */
        public String getLink() {
            return link;
        }

        /**
         *
         * @param link
         * The link
         */
        public void setLink(String link) {
            this.link = link;
        }

        /**
         *
         * @return
         * The author
         */
        public String getAuthor() {
            return author;
        }

        /**
         *
         * @param author
         * The author
         */
        public void setAuthor(String author) {
            this.author = author;
        }

        /**
         *
         * @return
         * The description
         */
        public String getDescription() {
            return description;
        }

        /**
         *
         * @param description
         * The description
         */
        public void setDescription(String description) {
            this.description = description;
        }

        /**
         *
         * @return
         * The image
         */
        public String getImage() {
            return image;
        }

        /**
         *
         * @param image
         * The image
         */
        public void setImage(String image) {
            this.image = image;
        }

    }
}
