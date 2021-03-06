package com.max.db.model;

import com.max.messaging.MaxTopic;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * Entity bean for remote subscribers
 */
public class RemoteSubscriber implements Serializable
{
    private Integer id;
    private String name;
    private String restUrl;
    private String filterString;
    private MaxTopic topic;
    private Integer timeout;
    private boolean autoRegister = true;

    public RemoteSubscriber()
    {}

    public RemoteSubscriber(Integer id, String name, String restUrl, String filterString, MaxTopic topic, Integer timeout, Boolean autoRegister)
    {
        this.id = id;
        this.name = name;
        this.restUrl = restUrl;
        this.filterString = filterString;
        this.topic = topic;
        this.timeout = timeout;
        this.autoRegister = autoRegister;
    }

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getRestUrl()
    {
        return restUrl;
    }

    public void setRestUrl(String restUrl)
    {
        this.restUrl = restUrl;
    }

    public Integer getTimeout()
    {
        return timeout;
    }

    public void setTimeout(Integer timeout)
    {
        this.timeout = timeout;
    }

    public boolean getAutoRegister()
    {
        return autoRegister;
    }

    public void setAutoRegister(boolean autoRegister)
    {
        this.autoRegister = autoRegister;
    }

    public String getFilterString()
    {
        return filterString;
    }

    public void setFilterString(String filterString)
    {
        this.filterString = filterString;
    }

    public MaxTopic getTopic()
    {
        return topic;
    }

    public void setTopic(MaxTopic topic)
    {
        this.topic = topic;
    }

    @Override
    public String toString()
    {
        return new ToStringBuilder(this).
                append("name", getName()).
                append("id", getId()).
                append("autoRegister", getAutoRegister()).
                append("filterString", getFilterString()).
                append("topic", getTopic()).build();
    }
}
