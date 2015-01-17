package model;

// Generated 2015/1/12 �U�� 12:51:08 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * StoreMember generated by hbm2java
 */
public class StoreMember implements java.io.Serializable {

	private int storeMemberId;
	private String storeUsername;
	private byte[] storePswd;
	private Date storeJoinDate;
	private String storePhone;
	private String imgFileName;
	private byte[] storeImage;
	private String storeEmail;
	private String storeWebsite;
	private Set<StoreInformation> storeInformations = new HashSet<StoreInformation>(
			0);
	private Set<GroupRoom> groupRooms = new HashSet<GroupRoom>(0);

	public StoreMember() {
	}

	public StoreMember(int storeMemberId) {
		this.storeMemberId = storeMemberId;
	}

	public StoreMember(int storeMemberId, String storeUsername,
			byte[] storePswd, Date storeJoinDate, String storePhone,
			String imgFileName, byte[] storeImage, String storeEmail,
			String storeWebsite, Set<StoreInformation> storeInformations,
			Set<GroupRoom> groupRooms) {
		this.storeMemberId = storeMemberId;
		this.storeUsername = storeUsername;
		this.storePswd = storePswd;
		this.storeJoinDate = storeJoinDate;
		this.storePhone = storePhone;
		this.imgFileName = imgFileName;
		this.storeImage = storeImage;
		this.storeEmail = storeEmail;
		this.storeWebsite = storeWebsite;
		this.storeInformations = storeInformations;
		this.groupRooms = groupRooms;
	}

	public int getStoreMemberId() {
		return this.storeMemberId;
	}

	public void setStoreMemberId(int storeMemberId) {
		this.storeMemberId = storeMemberId;
	}

	public String getStoreUsername() {
		return this.storeUsername;
	}

	public void setStoreUsername(String storeUsername) {
		this.storeUsername = storeUsername;
	}

	public byte[] getStorePswd() {
		return this.storePswd;
	}

	public void setStorePswd(byte[] storePswd) {
		this.storePswd = storePswd;
	}

	public Date getStoreJoinDate() {
		return this.storeJoinDate;
	}

	public void setStoreJoinDate(Date storeJoinDate) {
		this.storeJoinDate = storeJoinDate;
	}

	public String getStorePhone() {
		return this.storePhone;
	}

	public void setStorePhone(String storePhone) {
		this.storePhone = storePhone;
	}

	public String getImgFileName() {
		return this.imgFileName;
	}

	public void setImgFileName(String imgFileName) {
		this.imgFileName = imgFileName;
	}

	public byte[] getStoreImage() {
		return this.storeImage;
	}

	public void setStoreImage(byte[] storeImage) {
		this.storeImage = storeImage;
	}

	public String getStoreEmail() {
		return this.storeEmail;
	}

	public void setStoreEmail(String storeEmail) {
		this.storeEmail = storeEmail;
	}

	public String getStoreWebsite() {
		return this.storeWebsite;
	}

	public void setStoreWebsite(String storeWebsite) {
		this.storeWebsite = storeWebsite;
	}

	public Set<StoreInformation> getStoreInformations() {
		return this.storeInformations;
	}

	public void setStoreInformations(Set<StoreInformation> storeInformations) {
		this.storeInformations = storeInformations;
	}

	public Set<GroupRoom> getGroupRooms() {
		return this.groupRooms;
	}

	public void setGroupRooms(Set<GroupRoom> groupRooms) {
		this.groupRooms = groupRooms;
	}

}