package com.cg.ofda.service;

import java.util.List;

import com.cg.ofda.exception.OFDAException;
import com.cg.ofda.model.ItemModel;

public interface IItemService {

	/* definition of addItem method for adding new item */
	public ItemModel addItem(ItemModel item) throws OFDAException;

	/* definition of viewItem method for viewing item */
	public ItemModel viewItem(Long id) throws OFDAException;

	/* definition of updateItem method for updating Item */
	public ItemModel updateItem(ItemModel item) throws OFDAException;

	/* definition of removeItem method for removing Item */
	public boolean removeItem(Long id) throws OFDAException;

	/* definition of viewAllItems method for viewing all items */
	public List<ItemModel> viewAllItems() throws OFDAException;

}
