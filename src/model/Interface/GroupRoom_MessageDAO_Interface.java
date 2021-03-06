package model.Interface;

import java.util.List;

import model.GroupRoom_Message;

public interface GroupRoom_MessageDAO_Interface {
	public abstract GroupRoom_Message findByPrimeKey(Integer groupRoomMessageSerialNumber);

	public abstract List<GroupRoom_Message> getAll();

	public abstract void insert(GroupRoom_Message bean);

	public abstract void update(GroupRoom_Message bean);

	public abstract void delete(Integer groupRoomMessageSerialNumber);
}
