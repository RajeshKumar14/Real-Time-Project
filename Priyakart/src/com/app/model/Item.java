package com.app.model;

import java.util.Arrays;
import javax.persistence.Entity;

@Entity
public class Item {
	private int itemId;
	private String itemName;
	private String itemType;
	private String itemSubType;
	private String itemBrand;
	private double itemMrp;
	private String transactinDateAndTime;
	private double marginDiscount;
	private double vendorMargin;
	private double rebateValue;
	private double specialServiceCost;
	private double vat;
	private String details;
	private String service;
	private double avaliableQuantity;
	private String shipmentMode;
	private String modeOfPayment;
	private String itemPictureName1;
	private byte[] itemPictureData1;
	private String itemPictureName2;
	private byte[] itemPictureData2;
	private String itemPictureName3;
	private byte[] itemPictureData3;
	private String itemPictureName4;
	private byte[] itemPictureData4;
	private String itemPictureName5;
	private byte[] itemPictureData5;
	private int sellerId;
	public Item() {
		super();
	}
	public Item(int itemId) {
		super();
		this.itemId = itemId;
	}
	public Item(int itemId, String itemName) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
	}
	public Item(int itemId, String itemName, String itemType) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemType = itemType;
	}
	public Item(int itemId, String itemName, String itemType, String itemSubType) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemType = itemType;
		this.itemSubType = itemSubType;
	}
	public Item(int itemId, String itemName, String itemType, String itemSubType, String itemBrand) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemType = itemType;
		this.itemSubType = itemSubType;
		this.itemBrand = itemBrand;
	}
	public Item(int itemId, String itemName, String itemType, String itemSubType, String itemBrand, double itemMrp) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemType = itemType;
		this.itemSubType = itemSubType;
		this.itemBrand = itemBrand;
		this.itemMrp = itemMrp;
	}
	public Item(int itemId, String itemName, String itemType, String itemSubType, String itemBrand, double itemMrp,
			String transactinDateAndTime) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemType = itemType;
		this.itemSubType = itemSubType;
		this.itemBrand = itemBrand;
		this.itemMrp = itemMrp;
		this.transactinDateAndTime = transactinDateAndTime;
	}
	public Item(int itemId, String itemName, String itemType, String itemSubType, String itemBrand, double itemMrp,
			String transactinDateAndTime, double marginDiscount) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemType = itemType;
		this.itemSubType = itemSubType;
		this.itemBrand = itemBrand;
		this.itemMrp = itemMrp;
		this.transactinDateAndTime = transactinDateAndTime;
		this.marginDiscount = marginDiscount;
	}
	public Item(int itemId, String itemName, String itemType, String itemSubType, String itemBrand, double itemMrp,
			String transactinDateAndTime, double marginDiscount, double vendorMargin) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemType = itemType;
		this.itemSubType = itemSubType;
		this.itemBrand = itemBrand;
		this.itemMrp = itemMrp;
		this.transactinDateAndTime = transactinDateAndTime;
		this.marginDiscount = marginDiscount;
		this.vendorMargin = vendorMargin;
	}
	public Item(int itemId, String itemName, String itemType, String itemSubType, String itemBrand, double itemMrp,
			String transactinDateAndTime, double marginDiscount, double vendorMargin, double rebateValue) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemType = itemType;
		this.itemSubType = itemSubType;
		this.itemBrand = itemBrand;
		this.itemMrp = itemMrp;
		this.transactinDateAndTime = transactinDateAndTime;
		this.marginDiscount = marginDiscount;
		this.vendorMargin = vendorMargin;
		this.rebateValue = rebateValue;
	}
	public Item(int itemId, String itemName, String itemType, String itemSubType, String itemBrand, double itemMrp,
			String transactinDateAndTime, double marginDiscount, double vendorMargin, double rebateValue,
			double specialServiceCost) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemType = itemType;
		this.itemSubType = itemSubType;
		this.itemBrand = itemBrand;
		this.itemMrp = itemMrp;
		this.transactinDateAndTime = transactinDateAndTime;
		this.marginDiscount = marginDiscount;
		this.vendorMargin = vendorMargin;
		this.rebateValue = rebateValue;
		this.specialServiceCost = specialServiceCost;
	}
	public Item(int itemId, String itemName, String itemType, String itemSubType, String itemBrand, double itemMrp,
			String transactinDateAndTime, double marginDiscount, double vendorMargin, double rebateValue,
			double specialServiceCost, double vat) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemType = itemType;
		this.itemSubType = itemSubType;
		this.itemBrand = itemBrand;
		this.itemMrp = itemMrp;
		this.transactinDateAndTime = transactinDateAndTime;
		this.marginDiscount = marginDiscount;
		this.vendorMargin = vendorMargin;
		this.rebateValue = rebateValue;
		this.specialServiceCost = specialServiceCost;
		this.vat = vat;
	}
	public Item(int itemId, String itemName, String itemType, String itemSubType, String itemBrand, double itemMrp,
			String transactinDateAndTime, double marginDiscount, double vendorMargin, double rebateValue,
			double specialServiceCost, double vat, String details) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemType = itemType;
		this.itemSubType = itemSubType;
		this.itemBrand = itemBrand;
		this.itemMrp = itemMrp;
		this.transactinDateAndTime = transactinDateAndTime;
		this.marginDiscount = marginDiscount;
		this.vendorMargin = vendorMargin;
		this.rebateValue = rebateValue;
		this.specialServiceCost = specialServiceCost;
		this.vat = vat;
		this.details = details;
	}
	public Item(int itemId, String itemName, String itemType, String itemSubType, String itemBrand, double itemMrp,
			String transactinDateAndTime, double marginDiscount, double vendorMargin, double rebateValue,
			double specialServiceCost, double vat, String details, String service) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemType = itemType;
		this.itemSubType = itemSubType;
		this.itemBrand = itemBrand;
		this.itemMrp = itemMrp;
		this.transactinDateAndTime = transactinDateAndTime;
		this.marginDiscount = marginDiscount;
		this.vendorMargin = vendorMargin;
		this.rebateValue = rebateValue;
		this.specialServiceCost = specialServiceCost;
		this.vat = vat;
		this.details = details;
		this.service = service;
	}
	public Item(int itemId, String itemName, String itemType, String itemSubType, String itemBrand, double itemMrp,
			String transactinDateAndTime, double marginDiscount, double vendorMargin, double rebateValue,
			double specialServiceCost, double vat, String details, String service, double avaliableQuantity) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemType = itemType;
		this.itemSubType = itemSubType;
		this.itemBrand = itemBrand;
		this.itemMrp = itemMrp;
		this.transactinDateAndTime = transactinDateAndTime;
		this.marginDiscount = marginDiscount;
		this.vendorMargin = vendorMargin;
		this.rebateValue = rebateValue;
		this.specialServiceCost = specialServiceCost;
		this.vat = vat;
		this.details = details;
		this.service = service;
		this.avaliableQuantity = avaliableQuantity;
	}
	public Item(int itemId, String itemName, String itemType, String itemSubType, String itemBrand, double itemMrp,
			String transactinDateAndTime, double marginDiscount, double vendorMargin, double rebateValue,
			double specialServiceCost, double vat, String details, String service, double avaliableQuantity,
			String shipmentMode) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemType = itemType;
		this.itemSubType = itemSubType;
		this.itemBrand = itemBrand;
		this.itemMrp = itemMrp;
		this.transactinDateAndTime = transactinDateAndTime;
		this.marginDiscount = marginDiscount;
		this.vendorMargin = vendorMargin;
		this.rebateValue = rebateValue;
		this.specialServiceCost = specialServiceCost;
		this.vat = vat;
		this.details = details;
		this.service = service;
		this.avaliableQuantity = avaliableQuantity;
		this.shipmentMode = shipmentMode;
	}
	public Item(int itemId, String itemName, String itemType, String itemSubType, String itemBrand, double itemMrp,
			String transactinDateAndTime, double marginDiscount, double vendorMargin, double rebateValue,
			double specialServiceCost, double vat, String details, String service, double avaliableQuantity,
			String shipmentMode, String modeOfPayment) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemType = itemType;
		this.itemSubType = itemSubType;
		this.itemBrand = itemBrand;
		this.itemMrp = itemMrp;
		this.transactinDateAndTime = transactinDateAndTime;
		this.marginDiscount = marginDiscount;
		this.vendorMargin = vendorMargin;
		this.rebateValue = rebateValue;
		this.specialServiceCost = specialServiceCost;
		this.vat = vat;
		this.details = details;
		this.service = service;
		this.avaliableQuantity = avaliableQuantity;
		this.shipmentMode = shipmentMode;
		this.modeOfPayment = modeOfPayment;
	}
	public Item(int itemId, String itemName, String itemType, String itemSubType, String itemBrand, double itemMrp,
			String transactinDateAndTime, double marginDiscount, double vendorMargin, double rebateValue,
			double specialServiceCost, double vat, String details, String service, double avaliableQuantity,
			String shipmentMode, String modeOfPayment, String itemPictureName1) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemType = itemType;
		this.itemSubType = itemSubType;
		this.itemBrand = itemBrand;
		this.itemMrp = itemMrp;
		this.transactinDateAndTime = transactinDateAndTime;
		this.marginDiscount = marginDiscount;
		this.vendorMargin = vendorMargin;
		this.rebateValue = rebateValue;
		this.specialServiceCost = specialServiceCost;
		this.vat = vat;
		this.details = details;
		this.service = service;
		this.avaliableQuantity = avaliableQuantity;
		this.shipmentMode = shipmentMode;
		this.modeOfPayment = modeOfPayment;
		this.itemPictureName1 = itemPictureName1;
	}
	public Item(int itemId, String itemName, String itemType, String itemSubType, String itemBrand, double itemMrp,
			String transactinDateAndTime, double marginDiscount, double vendorMargin, double rebateValue,
			double specialServiceCost, double vat, String details, String service, double avaliableQuantity,
			String shipmentMode, String modeOfPayment, String itemPictureName1, byte[] itemPictureData1) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemType = itemType;
		this.itemSubType = itemSubType;
		this.itemBrand = itemBrand;
		this.itemMrp = itemMrp;
		this.transactinDateAndTime = transactinDateAndTime;
		this.marginDiscount = marginDiscount;
		this.vendorMargin = vendorMargin;
		this.rebateValue = rebateValue;
		this.specialServiceCost = specialServiceCost;
		this.vat = vat;
		this.details = details;
		this.service = service;
		this.avaliableQuantity = avaliableQuantity;
		this.shipmentMode = shipmentMode;
		this.modeOfPayment = modeOfPayment;
		this.itemPictureName1 = itemPictureName1;
		this.itemPictureData1 = itemPictureData1;
	}
	public Item(int itemId, String itemName, String itemType, String itemSubType, String itemBrand, double itemMrp,
			String transactinDateAndTime, double marginDiscount, double vendorMargin, double rebateValue,
			double specialServiceCost, double vat, String details, String service, double avaliableQuantity,
			String shipmentMode, String modeOfPayment, String itemPictureName1, byte[] itemPictureData1,
			String itemPictureName2) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemType = itemType;
		this.itemSubType = itemSubType;
		this.itemBrand = itemBrand;
		this.itemMrp = itemMrp;
		this.transactinDateAndTime = transactinDateAndTime;
		this.marginDiscount = marginDiscount;
		this.vendorMargin = vendorMargin;
		this.rebateValue = rebateValue;
		this.specialServiceCost = specialServiceCost;
		this.vat = vat;
		this.details = details;
		this.service = service;
		this.avaliableQuantity = avaliableQuantity;
		this.shipmentMode = shipmentMode;
		this.modeOfPayment = modeOfPayment;
		this.itemPictureName1 = itemPictureName1;
		this.itemPictureData1 = itemPictureData1;
		this.itemPictureName2 = itemPictureName2;
	}
	public Item(int itemId, String itemName, String itemType, String itemSubType, String itemBrand, double itemMrp,
			String transactinDateAndTime, double marginDiscount, double vendorMargin, double rebateValue,
			double specialServiceCost, double vat, String details, String service, double avaliableQuantity,
			String shipmentMode, String modeOfPayment, String itemPictureName1, byte[] itemPictureData1,
			String itemPictureName2, byte[] itemPictureData2) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemType = itemType;
		this.itemSubType = itemSubType;
		this.itemBrand = itemBrand;
		this.itemMrp = itemMrp;
		this.transactinDateAndTime = transactinDateAndTime;
		this.marginDiscount = marginDiscount;
		this.vendorMargin = vendorMargin;
		this.rebateValue = rebateValue;
		this.specialServiceCost = specialServiceCost;
		this.vat = vat;
		this.details = details;
		this.service = service;
		this.avaliableQuantity = avaliableQuantity;
		this.shipmentMode = shipmentMode;
		this.modeOfPayment = modeOfPayment;
		this.itemPictureName1 = itemPictureName1;
		this.itemPictureData1 = itemPictureData1;
		this.itemPictureName2 = itemPictureName2;
		this.itemPictureData2 = itemPictureData2;
	}
	public Item(int itemId, String itemName, String itemType, String itemSubType, String itemBrand, double itemMrp,
			String transactinDateAndTime, double marginDiscount, double vendorMargin, double rebateValue,
			double specialServiceCost, double vat, String details, String service, double avaliableQuantity,
			String shipmentMode, String modeOfPayment, String itemPictureName1, byte[] itemPictureData1,
			String itemPictureName2, byte[] itemPictureData2, String itemPictureName3) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemType = itemType;
		this.itemSubType = itemSubType;
		this.itemBrand = itemBrand;
		this.itemMrp = itemMrp;
		this.transactinDateAndTime = transactinDateAndTime;
		this.marginDiscount = marginDiscount;
		this.vendorMargin = vendorMargin;
		this.rebateValue = rebateValue;
		this.specialServiceCost = specialServiceCost;
		this.vat = vat;
		this.details = details;
		this.service = service;
		this.avaliableQuantity = avaliableQuantity;
		this.shipmentMode = shipmentMode;
		this.modeOfPayment = modeOfPayment;
		this.itemPictureName1 = itemPictureName1;
		this.itemPictureData1 = itemPictureData1;
		this.itemPictureName2 = itemPictureName2;
		this.itemPictureData2 = itemPictureData2;
		this.itemPictureName3 = itemPictureName3;
	}
	public Item(int itemId, String itemName, String itemType, String itemSubType, String itemBrand, double itemMrp,
			String transactinDateAndTime, double marginDiscount, double vendorMargin, double rebateValue,
			double specialServiceCost, double vat, String details, String service, double avaliableQuantity,
			String shipmentMode, String modeOfPayment, String itemPictureName1, byte[] itemPictureData1,
			String itemPictureName2, byte[] itemPictureData2, String itemPictureName3, byte[] itemPictureData3) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemType = itemType;
		this.itemSubType = itemSubType;
		this.itemBrand = itemBrand;
		this.itemMrp = itemMrp;
		this.transactinDateAndTime = transactinDateAndTime;
		this.marginDiscount = marginDiscount;
		this.vendorMargin = vendorMargin;
		this.rebateValue = rebateValue;
		this.specialServiceCost = specialServiceCost;
		this.vat = vat;
		this.details = details;
		this.service = service;
		this.avaliableQuantity = avaliableQuantity;
		this.shipmentMode = shipmentMode;
		this.modeOfPayment = modeOfPayment;
		this.itemPictureName1 = itemPictureName1;
		this.itemPictureData1 = itemPictureData1;
		this.itemPictureName2 = itemPictureName2;
		this.itemPictureData2 = itemPictureData2;
		this.itemPictureName3 = itemPictureName3;
		this.itemPictureData3 = itemPictureData3;
	}
	public Item(int itemId, String itemName, String itemType, String itemSubType, String itemBrand, double itemMrp,
			String transactinDateAndTime, double marginDiscount, double vendorMargin, double rebateValue,
			double specialServiceCost, double vat, String details, String service, double avaliableQuantity,
			String shipmentMode, String modeOfPayment, String itemPictureName1, byte[] itemPictureData1,
			String itemPictureName2, byte[] itemPictureData2, String itemPictureName3, byte[] itemPictureData3,
			String itemPictureName4) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemType = itemType;
		this.itemSubType = itemSubType;
		this.itemBrand = itemBrand;
		this.itemMrp = itemMrp;
		this.transactinDateAndTime = transactinDateAndTime;
		this.marginDiscount = marginDiscount;
		this.vendorMargin = vendorMargin;
		this.rebateValue = rebateValue;
		this.specialServiceCost = specialServiceCost;
		this.vat = vat;
		this.details = details;
		this.service = service;
		this.avaliableQuantity = avaliableQuantity;
		this.shipmentMode = shipmentMode;
		this.modeOfPayment = modeOfPayment;
		this.itemPictureName1 = itemPictureName1;
		this.itemPictureData1 = itemPictureData1;
		this.itemPictureName2 = itemPictureName2;
		this.itemPictureData2 = itemPictureData2;
		this.itemPictureName3 = itemPictureName3;
		this.itemPictureData3 = itemPictureData3;
		this.itemPictureName4 = itemPictureName4;
	}
	public Item(int itemId, String itemName, String itemType, String itemSubType, String itemBrand, double itemMrp,
			String transactinDateAndTime, double marginDiscount, double vendorMargin, double rebateValue,
			double specialServiceCost, double vat, String details, String service, double avaliableQuantity,
			String shipmentMode, String modeOfPayment, String itemPictureName1, byte[] itemPictureData1,
			String itemPictureName2, byte[] itemPictureData2, String itemPictureName3, byte[] itemPictureData3,
			String itemPictureName4, byte[] itemPictureData4) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemType = itemType;
		this.itemSubType = itemSubType;
		this.itemBrand = itemBrand;
		this.itemMrp = itemMrp;
		this.transactinDateAndTime = transactinDateAndTime;
		this.marginDiscount = marginDiscount;
		this.vendorMargin = vendorMargin;
		this.rebateValue = rebateValue;
		this.specialServiceCost = specialServiceCost;
		this.vat = vat;
		this.details = details;
		this.service = service;
		this.avaliableQuantity = avaliableQuantity;
		this.shipmentMode = shipmentMode;
		this.modeOfPayment = modeOfPayment;
		this.itemPictureName1 = itemPictureName1;
		this.itemPictureData1 = itemPictureData1;
		this.itemPictureName2 = itemPictureName2;
		this.itemPictureData2 = itemPictureData2;
		this.itemPictureName3 = itemPictureName3;
		this.itemPictureData3 = itemPictureData3;
		this.itemPictureName4 = itemPictureName4;
		this.itemPictureData4 = itemPictureData4;
	}
	public Item(int itemId, String itemName, String itemType, String itemSubType, String itemBrand, double itemMrp,
			String transactinDateAndTime, double marginDiscount, double vendorMargin, double rebateValue,
			double specialServiceCost, double vat, String details, String service, double avaliableQuantity,
			String shipmentMode, String modeOfPayment, String itemPictureName1, byte[] itemPictureData1,
			String itemPictureName2, byte[] itemPictureData2, String itemPictureName3, byte[] itemPictureData3,
			String itemPictureName4, byte[] itemPictureData4, String itemPictureName5) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemType = itemType;
		this.itemSubType = itemSubType;
		this.itemBrand = itemBrand;
		this.itemMrp = itemMrp;
		this.transactinDateAndTime = transactinDateAndTime;
		this.marginDiscount = marginDiscount;
		this.vendorMargin = vendorMargin;
		this.rebateValue = rebateValue;
		this.specialServiceCost = specialServiceCost;
		this.vat = vat;
		this.details = details;
		this.service = service;
		this.avaliableQuantity = avaliableQuantity;
		this.shipmentMode = shipmentMode;
		this.modeOfPayment = modeOfPayment;
		this.itemPictureName1 = itemPictureName1;
		this.itemPictureData1 = itemPictureData1;
		this.itemPictureName2 = itemPictureName2;
		this.itemPictureData2 = itemPictureData2;
		this.itemPictureName3 = itemPictureName3;
		this.itemPictureData3 = itemPictureData3;
		this.itemPictureName4 = itemPictureName4;
		this.itemPictureData4 = itemPictureData4;
		this.itemPictureName5 = itemPictureName5;
	}
	public Item(int itemId, String itemName, String itemType, String itemSubType, String itemBrand, double itemMrp,
			String transactinDateAndTime, double marginDiscount, double vendorMargin, double rebateValue,
			double specialServiceCost, double vat, String details, String service, double avaliableQuantity,
			String shipmentMode, String modeOfPayment, String itemPictureName1, byte[] itemPictureData1,
			String itemPictureName2, byte[] itemPictureData2, String itemPictureName3, byte[] itemPictureData3,
			String itemPictureName4, byte[] itemPictureData4, String itemPictureName5, byte[] itemPictureData5) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemType = itemType;
		this.itemSubType = itemSubType;
		this.itemBrand = itemBrand;
		this.itemMrp = itemMrp;
		this.transactinDateAndTime = transactinDateAndTime;
		this.marginDiscount = marginDiscount;
		this.vendorMargin = vendorMargin;
		this.rebateValue = rebateValue;
		this.specialServiceCost = specialServiceCost;
		this.vat = vat;
		this.details = details;
		this.service = service;
		this.avaliableQuantity = avaliableQuantity;
		this.shipmentMode = shipmentMode;
		this.modeOfPayment = modeOfPayment;
		this.itemPictureName1 = itemPictureName1;
		this.itemPictureData1 = itemPictureData1;
		this.itemPictureName2 = itemPictureName2;
		this.itemPictureData2 = itemPictureData2;
		this.itemPictureName3 = itemPictureName3;
		this.itemPictureData3 = itemPictureData3;
		this.itemPictureName4 = itemPictureName4;
		this.itemPictureData4 = itemPictureData4;
		this.itemPictureName5 = itemPictureName5;
		this.itemPictureData5 = itemPictureData5;
	}
	public Item(int itemId, String itemName, String itemType, String itemSubType, String itemBrand, double itemMrp,
			String transactinDateAndTime, double marginDiscount, double vendorMargin, double rebateValue,
			double specialServiceCost, double vat, String details, String service, double avaliableQuantity,
			String shipmentMode, String modeOfPayment, String itemPictureName1, byte[] itemPictureData1,
			String itemPictureName2, byte[] itemPictureData2, String itemPictureName3, byte[] itemPictureData3,
			String itemPictureName4, byte[] itemPictureData4, String itemPictureName5, byte[] itemPictureData5,
			int sellerId) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemType = itemType;
		this.itemSubType = itemSubType;
		this.itemBrand = itemBrand;
		this.itemMrp = itemMrp;
		this.transactinDateAndTime = transactinDateAndTime;
		this.marginDiscount = marginDiscount;
		this.vendorMargin = vendorMargin;
		this.rebateValue = rebateValue;
		this.specialServiceCost = specialServiceCost;
		this.vat = vat;
		this.details = details;
		this.service = service;
		this.avaliableQuantity = avaliableQuantity;
		this.shipmentMode = shipmentMode;
		this.modeOfPayment = modeOfPayment;
		this.itemPictureName1 = itemPictureName1;
		this.itemPictureData1 = itemPictureData1;
		this.itemPictureName2 = itemPictureName2;
		this.itemPictureData2 = itemPictureData2;
		this.itemPictureName3 = itemPictureName3;
		this.itemPictureData3 = itemPictureData3;
		this.itemPictureName4 = itemPictureName4;
		this.itemPictureData4 = itemPictureData4;
		this.itemPictureName5 = itemPictureName5;
		this.itemPictureData5 = itemPictureData5;
		this.sellerId = sellerId;
	}
	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", itemType=" + itemType + ", itemSubType="
				+ itemSubType + ", itemBrand=" + itemBrand + ", itemMrp=" + itemMrp + ", transactinDateAndTime="
				+ transactinDateAndTime + ", marginDiscount=" + marginDiscount + ", vendorMargin=" + vendorMargin
				+ ", rebateValue=" + rebateValue + ", specialServiceCost=" + specialServiceCost + ", vat=" + vat
				+ ", details=" + details + ", service=" + service + ", avaliableQuantity=" + avaliableQuantity
				+ ", shipmentMode=" + shipmentMode + ", modeOfPayment=" + modeOfPayment + ", itemPictureName1="
				+ itemPictureName1 + ", itemPictureData1=" + Arrays.toString(itemPictureData1) + ", itemPictureName2="
				+ itemPictureName2 + ", itemPictureData2=" + Arrays.toString(itemPictureData2) + ", itemPictureName3="
				+ itemPictureName3 + ", itemPictureData3=" + Arrays.toString(itemPictureData3) + ", itemPictureName4="
				+ itemPictureName4 + ", itemPictureData4=" + Arrays.toString(itemPictureData4) + ", itemPictureName5="
				+ itemPictureName5 + ", itemPictureData5=" + Arrays.toString(itemPictureData5) + ", sellerId="
				+ sellerId + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(avaliableQuantity);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((details == null) ? 0 : details.hashCode());
		result = prime * result + ((itemBrand == null) ? 0 : itemBrand.hashCode());
		result = prime * result + itemId;
		temp = Double.doubleToLongBits(itemMrp);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((itemName == null) ? 0 : itemName.hashCode());
		result = prime * result + Arrays.hashCode(itemPictureData1);
		result = prime * result + Arrays.hashCode(itemPictureData2);
		result = prime * result + Arrays.hashCode(itemPictureData3);
		result = prime * result + Arrays.hashCode(itemPictureData4);
		result = prime * result + Arrays.hashCode(itemPictureData5);
		result = prime * result + ((itemPictureName1 == null) ? 0 : itemPictureName1.hashCode());
		result = prime * result + ((itemPictureName2 == null) ? 0 : itemPictureName2.hashCode());
		result = prime * result + ((itemPictureName3 == null) ? 0 : itemPictureName3.hashCode());
		result = prime * result + ((itemPictureName4 == null) ? 0 : itemPictureName4.hashCode());
		result = prime * result + ((itemPictureName5 == null) ? 0 : itemPictureName5.hashCode());
		result = prime * result + ((itemSubType == null) ? 0 : itemSubType.hashCode());
		result = prime * result + ((itemType == null) ? 0 : itemType.hashCode());
		temp = Double.doubleToLongBits(marginDiscount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((modeOfPayment == null) ? 0 : modeOfPayment.hashCode());
		temp = Double.doubleToLongBits(rebateValue);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + sellerId;
		result = prime * result + ((service == null) ? 0 : service.hashCode());
		result = prime * result + ((shipmentMode == null) ? 0 : shipmentMode.hashCode());
		temp = Double.doubleToLongBits(specialServiceCost);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((transactinDateAndTime == null) ? 0 : transactinDateAndTime.hashCode());
		temp = Double.doubleToLongBits(vat);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(vendorMargin);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (Double.doubleToLongBits(avaliableQuantity) != Double.doubleToLongBits(other.avaliableQuantity))
			return false;
		if (details == null) {
			if (other.details != null)
				return false;
		} else if (!details.equals(other.details))
			return false;
		if (itemBrand == null) {
			if (other.itemBrand != null)
				return false;
		} else if (!itemBrand.equals(other.itemBrand))
			return false;
		if (itemId != other.itemId)
			return false;
		if (Double.doubleToLongBits(itemMrp) != Double.doubleToLongBits(other.itemMrp))
			return false;
		if (itemName == null) {
			if (other.itemName != null)
				return false;
		} else if (!itemName.equals(other.itemName))
			return false;
		if (!Arrays.equals(itemPictureData1, other.itemPictureData1))
			return false;
		if (!Arrays.equals(itemPictureData2, other.itemPictureData2))
			return false;
		if (!Arrays.equals(itemPictureData3, other.itemPictureData3))
			return false;
		if (!Arrays.equals(itemPictureData4, other.itemPictureData4))
			return false;
		if (!Arrays.equals(itemPictureData5, other.itemPictureData5))
			return false;
		if (itemPictureName1 == null) {
			if (other.itemPictureName1 != null)
				return false;
		} else if (!itemPictureName1.equals(other.itemPictureName1))
			return false;
		if (itemPictureName2 == null) {
			if (other.itemPictureName2 != null)
				return false;
		} else if (!itemPictureName2.equals(other.itemPictureName2))
			return false;
		if (itemPictureName3 == null) {
			if (other.itemPictureName3 != null)
				return false;
		} else if (!itemPictureName3.equals(other.itemPictureName3))
			return false;
		if (itemPictureName4 == null) {
			if (other.itemPictureName4 != null)
				return false;
		} else if (!itemPictureName4.equals(other.itemPictureName4))
			return false;
		if (itemPictureName5 == null) {
			if (other.itemPictureName5 != null)
				return false;
		} else if (!itemPictureName5.equals(other.itemPictureName5))
			return false;
		if (itemSubType == null) {
			if (other.itemSubType != null)
				return false;
		} else if (!itemSubType.equals(other.itemSubType))
			return false;
		if (itemType == null) {
			if (other.itemType != null)
				return false;
		} else if (!itemType.equals(other.itemType))
			return false;
		if (Double.doubleToLongBits(marginDiscount) != Double.doubleToLongBits(other.marginDiscount))
			return false;
		if (modeOfPayment == null) {
			if (other.modeOfPayment != null)
				return false;
		} else if (!modeOfPayment.equals(other.modeOfPayment))
			return false;
		if (Double.doubleToLongBits(rebateValue) != Double.doubleToLongBits(other.rebateValue))
			return false;
		if (sellerId != other.sellerId)
			return false;
		if (service == null) {
			if (other.service != null)
				return false;
		} else if (!service.equals(other.service))
			return false;
		if (shipmentMode == null) {
			if (other.shipmentMode != null)
				return false;
		} else if (!shipmentMode.equals(other.shipmentMode))
			return false;
		if (Double.doubleToLongBits(specialServiceCost) != Double.doubleToLongBits(other.specialServiceCost))
			return false;
		if (transactinDateAndTime == null) {
			if (other.transactinDateAndTime != null)
				return false;
		} else if (!transactinDateAndTime.equals(other.transactinDateAndTime))
			return false;
		if (Double.doubleToLongBits(vat) != Double.doubleToLongBits(other.vat))
			return false;
		if (Double.doubleToLongBits(vendorMargin) != Double.doubleToLongBits(other.vendorMargin))
			return false;
		return true;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemType() {
		return itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}
	public String getItemSubType() {
		return itemSubType;
	}
	public void setItemSubType(String itemSubType) {
		this.itemSubType = itemSubType;
	}
	public String getItemBrand() {
		return itemBrand;
	}
	public void setItemBrand(String itemBrand) {
		this.itemBrand = itemBrand;
	}
	public double getItemMrp() {
		return itemMrp;
	}
	public void setItemMrp(double itemMrp) {
		this.itemMrp = itemMrp;
	}
	public String getTransactinDateAndTime() {
		return transactinDateAndTime;
	}
	public void setTransactinDateAndTime(String transactinDateAndTime) {
		this.transactinDateAndTime = transactinDateAndTime;
	}
	public double getMarginDiscount() {
		return marginDiscount;
	}
	public void setMarginDiscount(double marginDiscount) {
		this.marginDiscount = marginDiscount;
	}
	public double getVendorMargin() {
		return vendorMargin;
	}
	public void setVendorMargin(double vendorMargin) {
		this.vendorMargin = vendorMargin;
	}
	public double getRebateValue() {
		return rebateValue;
	}
	public void setRebateValue(double rebateValue) {
		this.rebateValue = rebateValue;
	}
	public double getSpecialServiceCost() {
		return specialServiceCost;
	}
	public void setSpecialServiceCost(double specialServiceCost) {
		this.specialServiceCost = specialServiceCost;
	}
	public double getVat() {
		return vat;
	}
	public void setVat(double vat) {
		this.vat = vat;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	public double getAvaliableQuantity() {
		return avaliableQuantity;
	}
	public void setAvaliableQuantity(double avaliableQuantity) {
		this.avaliableQuantity = avaliableQuantity;
	}
	public String getShipmentMode() {
		return shipmentMode;
	}
	public void setShipmentMode(String shipmentMode) {
		this.shipmentMode = shipmentMode;
	}
	public String getModeOfPayment() {
		return modeOfPayment;
	}
	public void setModeOfPayment(String modeOfPayment) {
		this.modeOfPayment = modeOfPayment;
	}
	public String getItemPictureName1() {
		return itemPictureName1;
	}
	public void setItemPictureName1(String itemPictureName1) {
		this.itemPictureName1 = itemPictureName1;
	}
	public byte[] getItemPictureData1() {
		return itemPictureData1;
	}
	public void setItemPictureData1(byte[] itemPictureData1) {
		this.itemPictureData1 = itemPictureData1;
	}
	public String getItemPictureName2() {
		return itemPictureName2;
	}
	public void setItemPictureName2(String itemPictureName2) {
		this.itemPictureName2 = itemPictureName2;
	}
	public byte[] getItemPictureData2() {
		return itemPictureData2;
	}
	public void setItemPictureData2(byte[] itemPictureData2) {
		this.itemPictureData2 = itemPictureData2;
	}
	public String getItemPictureName3() {
		return itemPictureName3;
	}
	public void setItemPictureName3(String itemPictureName3) {
		this.itemPictureName3 = itemPictureName3;
	}
	public byte[] getItemPictureData3() {
		return itemPictureData3;
	}
	public void setItemPictureData3(byte[] itemPictureData3) {
		this.itemPictureData3 = itemPictureData3;
	}
	public String getItemPictureName4() {
		return itemPictureName4;
	}
	public void setItemPictureName4(String itemPictureName4) {
		this.itemPictureName4 = itemPictureName4;
	}
	public byte[] getItemPictureData4() {
		return itemPictureData4;
	}
	public void setItemPictureData4(byte[] itemPictureData4) {
		this.itemPictureData4 = itemPictureData4;
	}
	public String getItemPictureName5() {
		return itemPictureName5;
	}
	public void setItemPictureName5(String itemPictureName5) {
		this.itemPictureName5 = itemPictureName5;
	}
	public byte[] getItemPictureData5() {
		return itemPictureData5;
	}
	public void setItemPictureData5(byte[] itemPictureData5) {
		this.itemPictureData5 = itemPictureData5;
	}
	public int getSellerId() {
		return sellerId;
	}
	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
	}
	
}
