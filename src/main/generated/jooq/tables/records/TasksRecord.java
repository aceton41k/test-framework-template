/*
 * This file is generated by jOOQ.
 */
package jooq.tables.records;


import java.time.OffsetDateTime;

import jooq.tables.Tasks;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class TasksRecord extends UpdatableRecordImpl<TasksRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.tasks.id</code>.
     */
    public TasksRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.tasks.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.tasks.created_at</code>.
     */
    public TasksRecord setCreatedAt(OffsetDateTime value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.tasks.created_at</code>.
     */
    public OffsetDateTime getCreatedAt() {
        return (OffsetDateTime) get(1);
    }

    /**
     * Setter for <code>public.tasks.created_by</code>.
     */
    public TasksRecord setCreatedBy(Long value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.tasks.created_by</code>.
     */
    public Long getCreatedBy() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>public.tasks.progress</code>.
     */
    public TasksRecord setProgress(Integer value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.tasks.progress</code>.
     */
    public Integer getProgress() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>public.tasks.status</code>.
     */
    public TasksRecord setStatus(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>public.tasks.status</code>.
     */
    public String getStatus() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.tasks.updated_at</code>.
     */
    public TasksRecord setUpdatedAt(OffsetDateTime value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>public.tasks.updated_at</code>.
     */
    public OffsetDateTime getUpdatedAt() {
        return (OffsetDateTime) get(5);
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
     * Create a detached TasksRecord
     */
    public TasksRecord() {
        super(Tasks.TASKS);
    }

    /**
     * Create a detached, initialised TasksRecord
     */
    public TasksRecord(Long id, OffsetDateTime createdAt, Long createdBy, Integer progress, String status, OffsetDateTime updatedAt) {
        super(Tasks.TASKS);

        setId(id);
        setCreatedAt(createdAt);
        setCreatedBy(createdBy);
        setProgress(progress);
        setStatus(status);
        setUpdatedAt(updatedAt);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised TasksRecord
     */
    public TasksRecord(jooq.tables.pojos.Tasks value) {
        super(Tasks.TASKS);

        if (value != null) {
            setId(value.getId());
            setCreatedAt(value.getCreatedAt());
            setCreatedBy(value.getCreatedBy());
            setProgress(value.getProgress());
            setStatus(value.getStatus());
            setUpdatedAt(value.getUpdatedAt());
            resetChangedOnNotNull();
        }
    }
}
