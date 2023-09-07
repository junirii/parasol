/**
 * 채권 Entity
 * 채권 식별번호, 상품이름, 만기 날짜, 수익률, 위험도, 신용등급, 링크, 이미지
 */



package kbits.kb04.parasol.finance.entity;
import java.sql.Date;

import javax.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "bond")
public class Bond {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bond_SEQ")
	@SequenceGenerator(sequenceName = "bond_SEQ", allocationSize = 1, name = "bond_SEQ")	
	private Long bondNo;

	@Column(name = "bond_name")
	private String bondName;
	
	@Column(name = "bond_date")
	private Date bondDate;
	
	@Column(name = "bond_rate")
	private Float bondRate;

	@Column(name = "bond_risk")
	private Integer bondRisk;
	
	@Column(name = "bond_credit")
	private String bondCredit;
	
	@Column(name = "bond_link")
	private String bondLink;

	@Column(name = "bond_Img")
	private String bondImg;

	public Bond(Long bondNo, String bondName, Date bondDate, Float bondRate, Integer bondRisk, String bondCredit,
			String bondLink, String bondImg) {
		super();
		this.bondNo = bondNo;
		this.bondName = bondName;
		this.bondDate = bondDate;
		this.bondRate = bondRate;
		this.bondRisk = bondRisk;
		this.bondCredit = bondCredit;
		this.bondLink = bondLink;
		this.bondImg = bondImg;
	}
	
}
