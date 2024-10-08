/*
 * This file is generated by jOOQ.
 */
package jooq.tables.records;


import java.time.OffsetDateTime;

import jooq.tables.Comments;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class CommentsRecord extends UpdatableRecordImpl<CommentsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.comments.id</code>.
     */
    public CommentsRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.comments.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.comments.created_at</code>.
     */
    public CommentsRecord setCreatedAt(OffsetDateTime value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.comments.created_at</code>.
     */
    public OffsetDateTime getCreatedAt() {
        return (OffsetDateTime) get(1);
    }

    /**
     * Setter for <code>public.comments.created_by</code>.
     */
    public CommentsRecord setCreatedBy(Long value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.comments.created_by</code>.
     */
    public Long getCreatedBy() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>public.comments.message</code>.
     */
    public CommentsRecord setMessage(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.comments.message</code>.
     */
    public String getMessage() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.comments.modified_by</code>.
     */
    public CommentsRecord setModifiedBy(Long value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>public.comments.modified_by</code>.
     */
    public Long getModifiedBy() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>public.comments.updated_at</code>.
     */
    public CommentsRecord setUpdatedAt(OffsetDateTime value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>public.comments.updated_at</code>.
     */
    public OffsetDateTime getUpdatedAt() {
        return (OffsetDateTime) get(5);
    }

    /**
     * Setter for <code>public.comments.post_id</code>.
     */
    public CommentsRecord setPostId(Long value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>public.comments.post_id</code>.
     */
    public Long getPostId() {
        return (Long) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CommentsRecord
     */
    public CommentsRecord() {
        super(Comments.COMMENTS);
    }

    /**
     * Create a detached, initialised CommentsRecord
     */
    public CommentsRecord(Long id, OffsetDateTime createdAt, Long createdBy, String message, Long modifiedBy, OffsetDateTime updatedAt, Long postId) {
        super(Comments.COMMENTS);

        setId(id);
        setCreatedAt(createdAt);
        setCreatedBy(createdBy);
        setMessage(message);
        setModifiedBy(modifiedBy);
        setUpdatedAt(updatedAt);
        setPostId(postId);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised CommentsRecord
     */
    public CommentsRecord(jooq.tables.pojos.Comments value) {
        super(Comments.COMMENTS);

        if (value != null) {
            setId(value.getId());
            setCreatedAt(value.getCreatedAt());
            setCreatedBy(value.getCreatedBy());
            setMessage(value.getMessage());
            setModifiedBy(value.getModifiedBy());
            setUpdatedAt(value.getUpdatedAt());
            setPostId(value.getPostId());
            resetChangedOnNotNull();
        }
    }
}
