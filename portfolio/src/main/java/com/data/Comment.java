package com.data;

/** An item on a message board */
public final class Comment {

    private final long id;
    private final String name;
    private final String email;
    private final String subject;
    private final String message;
    private final long timestamp;
  
    public Comment(long id, String name, String email, String subject, String message, long timestamp) {
      this.id = id;
      this.name = name;
      this.email = email;
      this.subject = subject;
      this.message = message;
      this.timestamp = timestamp;
    }
  }