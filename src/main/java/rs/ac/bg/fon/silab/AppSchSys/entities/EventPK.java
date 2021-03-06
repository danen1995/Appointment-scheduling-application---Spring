/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.silab.AppSchSys.entities;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Dane
 */
@Embeddable
public class EventPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "CALENDAR_ID")
    private BigInteger calendarId;
    @Basic(optional = false)
    @Column(name = "EVENT_ID")
    private BigInteger eventId;

    public EventPK() {
    }

    public EventPK(BigInteger calendarId, BigInteger eventId) {
        this.calendarId = calendarId;
        this.eventId = eventId;
    }

    public void setCalendarId(BigInteger calendarId) {
        this.calendarId = calendarId;
    }

    public void setEventId(BigInteger eventId) {
        this.eventId = eventId;
    }

    public BigInteger getCalendarId() {
        return calendarId;
    }

    public BigInteger getEventId() {
        return eventId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (calendarId != null ? calendarId.hashCode() : 0);
        hash += (eventId != null ? eventId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EventPK)) {
            return false;
        }
        EventPK other = (EventPK) object;
        if ((this.calendarId == null && other.calendarId != null) || (this.calendarId != null && !this.calendarId.equals(other.calendarId))) {
            return false;
        }
        if ((this.eventId == null && other.eventId != null) || (this.eventId != null && !this.eventId.equals(other.eventId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.diplomski.classes.EventPK[ calendarId=" + calendarId + ", eventId=" + eventId + " ]";
    }

}
