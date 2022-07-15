package be.intecbrussel.business;

import be.intecbrussel.bericht.commons.Message;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MessageEntity implements Message {

    @Id
    private Long joeyId;

    private String message;

    private String username;

    @Override
    public Long getId() {
        return this.joeyId;
    }

    @Override
    public String getMessage() {
        return this.message;
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    @Override
    public void setId(Long aLong) {

    }

    @Override
    public void setMessage(String s) {

    }

    @Override
    public void setUsername(String s) {

    }
}
