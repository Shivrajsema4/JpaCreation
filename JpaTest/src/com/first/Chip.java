package com.first;
// Generated 31 Aug, 2017 6:35:12 PM by Hibernate Tools 5.2.5.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Chip generated by hbm2java
 */
@Entity
@Table(name = "chip", catalog = "osdashboard")
public class Chip implements java.io.Serializable {

	private Integer id;
	private String name;
	private Set<InstrumentTypeChip> instrumentTypeChips = new HashSet<InstrumentTypeChip>(0);
	private Set<RunCombination> runCombinations = new HashSet<RunCombination>(0);
	private Set<InstrumentTypeChip> instrumentTypeChips_1 = new HashSet<InstrumentTypeChip>(0);
	private Set<RunCombination> runCombinations_1 = new HashSet<RunCombination>(0);

	public Chip() {
	}

	public Chip(String name, Set<InstrumentTypeChip> instrumentTypeChips, Set<RunCombination> runCombinations,
			Set<InstrumentTypeChip> instrumentTypeChips_1, Set<RunCombination> runCombinations_1) {
		this.name = name;
		this.instrumentTypeChips = instrumentTypeChips;
		this.runCombinations = runCombinations;
		this.instrumentTypeChips_1 = instrumentTypeChips_1;
		this.runCombinations_1 = runCombinations_1;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "name", length = 100)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "chip")
	public Set<InstrumentTypeChip> getInstrumentTypeChips() {
		return this.instrumentTypeChips;
	}

	public void setInstrumentTypeChips(Set<InstrumentTypeChip> instrumentTypeChips) {
		this.instrumentTypeChips = instrumentTypeChips;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "chip")
	public Set<RunCombination> getRunCombinations() {
		return this.runCombinations;
	}

	public void setRunCombinations(Set<RunCombination> runCombinations) {
		this.runCombinations = runCombinations;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "chip")
	public Set<InstrumentTypeChip> getInstrumentTypeChips_1() {
		return this.instrumentTypeChips_1;
	}

	public void setInstrumentTypeChips_1(Set<InstrumentTypeChip> instrumentTypeChips_1) {
		this.instrumentTypeChips_1 = instrumentTypeChips_1;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "chip")
	public Set<RunCombination> getRunCombinations_1() {
		return this.runCombinations_1;
	}

	public void setRunCombinations_1(Set<RunCombination> runCombinations_1) {
		this.runCombinations_1 = runCombinations_1;
	}

}
