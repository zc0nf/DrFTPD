/*
 * This file is part of DrFTPD, Distributed FTP Daemon.
 *
 * DrFTPD is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * DrFTPD is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with DrFTPD; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */
package net.sf.drftpd.event;


/**
 * @author mog
 *
 * @version $Id$
 */
public class MessageEvent extends Event {
    private String message;

    public MessageEvent(String command, String message) {
        this(command, message, System.currentTimeMillis());
    }

    public MessageEvent(String command, String message, long time) {
        super(command, time);
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}
