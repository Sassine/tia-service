package com.tiaservice.webhook.dto;

import java.util.List;

public class TableCardRow {
	private List<TableCardCell> cells;
	private Boolean dividerAfter;

	/**
	 * @return the cells
	 */
	public List<TableCardCell> getCells() {
		return cells;
	}

	/**
	 * @param cells
	 *            the cells to set
	 */
	public void setCells(List<TableCardCell> cells) {
		this.cells = cells;
	}

	/**
	 * @return the dividerAfter
	 */
	public Boolean getDividerAfter() {
		return dividerAfter;
	}

	/**
	 * @param dividerAfter
	 *            the dividerAfter to set
	 */
	public void setDividerAfter(Boolean dividerAfter) {
		this.dividerAfter = dividerAfter;
	}

}
