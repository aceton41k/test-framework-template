/*
 * This file is generated by jOOQ.
 */
package jooq.tables.pojos;


import java.io.Serializable;
import java.time.OffsetDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class Comments implements Serializable {

    private static final long serialVersionUID = 1L;

    private final Long id;
    private final OffsetDateTime createdAt;
    private final Long createdBy;
    private final String message;
    private final Long modifiedBy;
    private final OffsetDateTime updatedAt;
    private final Long postId;

    public Comments(Comments value) {
        this.id = value.id;
        this.createdAt = value.createdAt;
        this.createdBy = value.createdBy;
        this.message = value.message;
        this.modifiedBy = value.modifiedBy;
        this.updatedAt = value.updatedAt;
        this.postId = value.postId;
    }

    public Comments(
        Long id,
        OffsetDateTime createdAt,
        Long createdBy,
        String message,
        Long modifiedBy,
        OffsetDateTime updatedAt,
        Long postId
    ) {
        this.id = id;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.message = message;
        this.modifiedBy = modifiedBy;
        this.updatedAt = updatedAt;
        this.postId = postId;
    }

    /**
     * Getter for <code>public.comments.id</code>.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Getter for <code>public.comments.created_at</code>.
     */
    public OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Getter for <code>public.comments.created_by</code>.
     */
    public Long getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Getter for <code>public.comments.message</code>.
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Getter for <code>public.comments.modified_by</code>.
     */
    public Long getModifiedBy() {
        return this.modifiedBy;
    }

    /**
     * Getter for <code>public.comments.updated_at</code>.
     */
    public OffsetDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * Getter for <code>public.comments.post_id</code>.
     */
    public Long getPostId() {
        return this.postId;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Comments other = (Comments) obj;
        if (this.id == null) {
            if (other.id != null)
                return false;
        }
        else if (!this.id.equals(other.id))
            return false;
        if (this.createdAt == null) {
            if (other.createdAt != null)
                return false;
        }
        else if (!this.createdAt.equals(other.createdAt))
            return false;
        if (this.createdBy == null) {
            if (other.createdBy != null)
                return false;
        }
        else if (!this.createdBy.equals(other.createdBy))
            return false;
        if (this.message == null) {
            if (other.message != null)
                return false;
        }
        else if (!this.message.equals(other.message))
            return false;
        if (this.modifiedBy == null) {
            if (other.modifiedBy != null)
                return false;
        }
        else if (!this.modifiedBy.equals(other.modifiedBy))
            return false;
        if (this.updatedAt == null) {
            if (other.updatedAt != null)
                return false;
        }
        else if (!this.updatedAt.equals(other.updatedAt))
            return false;
        if (this.postId == null) {
            if (other.postId != null)
                return false;
        }
        else if (!this.postId.equals(other.postId))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.createdAt == null) ? 0 : this.createdAt.hashCode());
        result = prime * result + ((this.createdBy == null) ? 0 : this.createdBy.hashCode());
        result = prime * result + ((this.message == null) ? 0 : this.message.hashCode());
        result = prime * result + ((this.modifiedBy == null) ? 0 : this.modifiedBy.hashCode());
        result = prime * result + ((this.updatedAt == null) ? 0 : this.updatedAt.hashCode());
        result = prime * result + ((this.postId == null) ? 0 : this.postId.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Comments (");

        sb.append(id);
        sb.append(", ").append(createdAt);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(message);
        sb.append(", ").append(modifiedBy);
        sb.append(", ").append(updatedAt);
        sb.append(", ").append(postId);

        sb.append(")");
        return sb.toString();
    }
}
