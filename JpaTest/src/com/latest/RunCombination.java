package com.latest;
// Generated 31 Aug, 2017 7:26:20 PM by Hibernate Tools 5.2.5.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * RunCombination generated by hbm2java
 */
@Entity
@Table(name = "run_combination", catalog = "osdashboard")
public class RunCombination implements java.io.Serializable {

	private Integer id;
	private Chip chip;
	private Instrument instrument;
	private Panel panel;
	private Set<RunQcParameter> runQcParameters = new HashSet<RunQcParameter>(0);
	private Set<TargetBins> targetBinses = new HashSet<TargetBins>(0);
	private Set<Run> runs = new HashSet<Run>(0);
	private Set<Target> targets = new HashSet<Target>(0);
	private Set<Gene> genes = new HashSet<Gene>(0);

	public RunCombination() {
	}

	public RunCombination(Chip chip, Instrument instrument, Panel panel) {
		this.chip = chip;
		this.instrument = instrument;
		this.panel = panel;
	}

	public RunCombination(Chip chip, Instrument instrument, Panel panel, Set<RunQcParameter> runQcParameters,
			Set<TargetBins> targetBinses, Set<Run> runs, Set<Target> targets, Set<Gene> genes) {
		this.chip = chip;
		this.instrument = instrument;
		this.panel = panel;
		this.runQcParameters = runQcParameters;
		this.targetBinses = targetBinses;
		this.runs = runs;
		this.targets = targets;
		this.genes = genes;
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

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "chip_id", nullable = false)
	public Chip getChip() {
		return this.chip;
	}

	public void setChip(Chip chip) {
		this.chip = chip;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "instrument_id", nullable = false)
	public Instrument getInstrument() {
		return this.instrument;
	}

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "panel_id", nullable = false)
	public Panel getPanel() {
		return this.panel;
	}

	public void setPanel(Panel panel) {
		this.panel = panel;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "runCombination")
	public Set<RunQcParameter> getRunQcParameters() {
		return this.runQcParameters;
	}

	public void setRunQcParameters(Set<RunQcParameter> runQcParameters) {
		this.runQcParameters = runQcParameters;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "runCombination")
	public Set<TargetBins> getTargetBinses() {
		return this.targetBinses;
	}

	public void setTargetBinses(Set<TargetBins> targetBinses) {
		this.targetBinses = targetBinses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "runCombination")
	public Set<Run> getRuns() {
		return this.runs;
	}

	public void setRuns(Set<Run> runs) {
		this.runs = runs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "runCombination")
	public Set<Target> getTargets() {
		return this.targets;
	}

	public void setTargets(Set<Target> targets) {
		this.targets = targets;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "runCombination")
	public Set<Gene> getGenes() {
		return this.genes;
	}

	public void setGenes(Set<Gene> genes) {
		this.genes = genes;
	}

}