package com.first;
// Generated 31 Aug, 2017 6:35:12 PM by Hibernate Tools 5.2.5.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Sample generated by hbm2java
 */
@Entity
@Table(name = "sample", catalog = "osdashboard")
public class Sample implements java.io.Serializable {

	private int id;
	private Order order;
	private String barcode;
	private String tumorType;
	private String tumorCellularity;
	private Integer mappedReads;
	private Float meanDepth;
	private Float onTarget;
	private Float uniformity;
	private Integer altAlleles;
	private Integer polymorphicAltAlleles;
	private Integer accessionNo;
	private String folder;
	private Date created;
	private Boolean isControlSample;
	private Set<SampleRun> sampleRuns = new HashSet<SampleRun>(0);
	private Set<SampleRun> sampleRuns_1 = new HashSet<SampleRun>(0);

	public Sample() {
	}

	public Sample(int id, Order order) {
		this.id = id;
		this.order = order;
	}

	public Sample(int id, Order order, String barcode, String tumorType, String tumorCellularity, Integer mappedReads,
			Float meanDepth, Float onTarget, Float uniformity, Integer altAlleles, Integer polymorphicAltAlleles,
			Integer accessionNo, String folder, Date created, Boolean isControlSample, Set<SampleRun> sampleRuns,
			Set<SampleRun> sampleRuns_1) {
		this.id = id;
		this.order = order;
		this.barcode = barcode;
		this.tumorType = tumorType;
		this.tumorCellularity = tumorCellularity;
		this.mappedReads = mappedReads;
		this.meanDepth = meanDepth;
		this.onTarget = onTarget;
		this.uniformity = uniformity;
		this.altAlleles = altAlleles;
		this.polymorphicAltAlleles = polymorphicAltAlleles;
		this.accessionNo = accessionNo;
		this.folder = folder;
		this.created = created;
		this.isControlSample = isControlSample;
		this.sampleRuns = sampleRuns;
		this.sampleRuns_1 = sampleRuns_1;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "order_id", nullable = false)
	public Order getOrder() {
		return this.order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	@Column(name = "barcode", length = 45)
	public String getBarcode() {
		return this.barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	@Column(name = "tumor_type", length = 45)
	public String getTumorType() {
		return this.tumorType;
	}

	public void setTumorType(String tumorType) {
		this.tumorType = tumorType;
	}

	@Column(name = "tumor_cellularity", length = 45)
	public String getTumorCellularity() {
		return this.tumorCellularity;
	}

	public void setTumorCellularity(String tumorCellularity) {
		this.tumorCellularity = tumorCellularity;
	}

	@Column(name = "mapped_reads")
	public Integer getMappedReads() {
		return this.mappedReads;
	}

	public void setMappedReads(Integer mappedReads) {
		this.mappedReads = mappedReads;
	}

	@Column(name = "mean_depth", precision = 12, scale = 0)
	public Float getMeanDepth() {
		return this.meanDepth;
	}

	public void setMeanDepth(Float meanDepth) {
		this.meanDepth = meanDepth;
	}

	@Column(name = "on_target", precision = 12, scale = 0)
	public Float getOnTarget() {
		return this.onTarget;
	}

	public void setOnTarget(Float onTarget) {
		this.onTarget = onTarget;
	}

	@Column(name = "uniformity", precision = 12, scale = 0)
	public Float getUniformity() {
		return this.uniformity;
	}

	public void setUniformity(Float uniformity) {
		this.uniformity = uniformity;
	}

	@Column(name = "alt_alleles")
	public Integer getAltAlleles() {
		return this.altAlleles;
	}

	public void setAltAlleles(Integer altAlleles) {
		this.altAlleles = altAlleles;
	}

	@Column(name = "polymorphic_alt_alleles")
	public Integer getPolymorphicAltAlleles() {
		return this.polymorphicAltAlleles;
	}

	public void setPolymorphicAltAlleles(Integer polymorphicAltAlleles) {
		this.polymorphicAltAlleles = polymorphicAltAlleles;
	}

	@Column(name = "accession_no")
	public Integer getAccessionNo() {
		return this.accessionNo;
	}

	public void setAccessionNo(Integer accessionNo) {
		this.accessionNo = accessionNo;
	}

	@Column(name = "folder", length = 45)
	public String getFolder() {
		return this.folder;
	}

	public void setFolder(String folder) {
		this.folder = folder;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created", length = 19)
	public Date getCreated() {
		return this.created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	@Column(name = "is_control_sample")
	public Boolean getIsControlSample() {
		return this.isControlSample;
	}

	public void setIsControlSample(Boolean isControlSample) {
		this.isControlSample = isControlSample;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "sample")
	public Set<SampleRun> getSampleRuns() {
		return this.sampleRuns;
	}

	public void setSampleRuns(Set<SampleRun> sampleRuns) {
		this.sampleRuns = sampleRuns;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "sample")
	public Set<SampleRun> getSampleRuns_1() {
		return this.sampleRuns_1;
	}

	public void setSampleRuns_1(Set<SampleRun> sampleRuns_1) {
		this.sampleRuns_1 = sampleRuns_1;
	}

}
