package com.yangjiang.entity.t_zgk_pipe_fcd;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.SequenceGenerator;

/**   
 * @Title: Entity
 * @Description: 返厂子表
 * @author zhangdaihao
 * @date 2016-12-06 11:30:11
 * @version V1.0   
 *
 */
@Entity
@Table(name = "T_ZGK_PIPE_FCD", schema = "")
@DynamicUpdate(true)
@DynamicInsert(true)
@SuppressWarnings("serial")
public class T_ZGK_PIPE_FCDEntity implements java.io.Serializable {
	/**返厂单号*/
	private java.lang.String fankudanid;
	/**规格*/
	private java.lang.String dn;
	/**批号*/
	private java.lang.String batchFull;
	/**管序号*/
	private java.lang.String pipeSerial;
	/**包号*/
	private java.lang.String packageid;
	/**管材编码*/
	private java.lang.String itemCode;
	/**管材名称*/
	private java.lang.String itemCname;
	/**内外销标志*/
	private java.lang.String expFlag;
	/**特殊合同描述*/
	private java.lang.String specialDesc;
	/**支数*/
	private java.lang.Integer pipenum;
	/**套装方式*/
	private java.lang.String suitWay;
	/**货位*/
	private java.lang.String huowei;
	/**层号*/
	private java.lang.Integer cengci;
	/**层内序号*/
	private java.lang.Integer cengneixuhao;
	/**生产线*/
	private java.lang.String productLine;
	/**编号*/
	private java.lang.String id;
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  返厂单号
	 */
	@Column(name ="FANKUDANID",nullable=false,precision=20,length=20)
	public java.lang.String getFankudanid(){
		return this.fankudanid;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  返厂单号
	 */
	public void setFankudanid(java.lang.String fankudanid){
		this.fankudanid = fankudanid;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  规格
	 */
	@Column(name ="DN",nullable=false,precision=10,length=10)
	public java.lang.String getDn(){
		return this.dn;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  规格
	 */
	public void setDn(java.lang.String dn){
		this.dn = dn;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  批号
	 */
	@Column(name ="BATCH_FULL",nullable=false,precision=10,length=10)
	public java.lang.String getBatchFull(){
		return this.batchFull;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  批号
	 */
	public void setBatchFull(java.lang.String batchFull){
		this.batchFull = batchFull;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  管序号
	 */
	@Column(name ="PIPE_SERIAL",nullable=false,precision=10,length=10)
	public java.lang.String getPipeSerial(){
		return this.pipeSerial;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  管序号
	 */
	public void setPipeSerial(java.lang.String pipeSerial){
		this.pipeSerial = pipeSerial;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  包号
	 */
	@Column(name ="PACKAGEID",nullable=true,precision=20,length=20)
	public java.lang.String getPackageid(){
		return this.packageid;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  包号
	 */
	public void setPackageid(java.lang.String packageid){
		this.packageid = packageid;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  管材编码
	 */
	@Column(name ="ITEM_CODE",nullable=true,precision=20,length=20)
	public java.lang.String getItemCode(){
		return this.itemCode;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  管材编码
	 */
	public void setItemCode(java.lang.String itemCode){
		this.itemCode = itemCode;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  管材名称
	 */
	@Column(name ="ITEM_CNAME",nullable=true,precision=200,length=200)
	public java.lang.String getItemCname(){
		return this.itemCname;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  管材名称
	 */
	public void setItemCname(java.lang.String itemCname){
		this.itemCname = itemCname;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  内外销标志
	 */
	@Column(name ="EXP_FLAG",nullable=true,precision=3,length=3)
	public java.lang.String getExpFlag(){
		return this.expFlag;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  内外销标志
	 */
	public void setExpFlag(java.lang.String expFlag){
		this.expFlag = expFlag;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  特殊合同描述
	 */
	@Column(name ="SPECIAL_DESC",nullable=true,precision=30,length=30)
	public java.lang.String getSpecialDesc(){
		return this.specialDesc;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  特殊合同描述
	 */
	public void setSpecialDesc(java.lang.String specialDesc){
		this.specialDesc = specialDesc;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  支数
	 */
	@Column(name ="PIPENUM",nullable=true,precision=3,scale=0,length=1)
	public java.lang.Integer getPipenum(){
		return this.pipenum;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  支数
	 */
	public void setPipenum(java.lang.Integer pipenum){
		this.pipenum = pipenum;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  套装方式
	 */
	@Column(name ="SUIT_WAY",nullable=true,precision=30,length=30)
	public java.lang.String getSuitWay(){
		return this.suitWay;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  套装方式
	 */
	public void setSuitWay(java.lang.String suitWay){
		this.suitWay = suitWay;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  货位
	 */
	@Column(name ="HUOWEI",nullable=true,precision=10,length=10)
	public java.lang.String getHuowei(){
		return this.huowei;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  货位
	 */
	public void setHuowei(java.lang.String huowei){
		this.huowei = huowei;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  层号
	 */
	@Column(name ="CENGCI",nullable=true,precision=3,scale=0,length=1)
	public java.lang.Integer getCengci(){
		return this.cengci;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  层号
	 */
	public void setCengci(java.lang.Integer cengci){
		this.cengci = cengci;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  层内序号
	 */
	@Column(name ="CENGNEIXUHAO",nullable=true,precision=3,scale=0,length=1)
	public java.lang.Integer getCengneixuhao(){
		return this.cengneixuhao;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  层内序号
	 */
	public void setCengneixuhao(java.lang.Integer cengneixuhao){
		this.cengneixuhao = cengneixuhao;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  生产线
	 */
	@Column(name ="PRODUCT_LINE",nullable=true,precision=20,length=20)
	public java.lang.String getProductLine(){
		return this.productLine;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  生产线
	 */
	public void setProductLine(java.lang.String productLine){
		this.productLine = productLine;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  编号
	 */
	
	@Id
	@GeneratedValue(generator = "paymentableGenerator")
	@GenericGenerator(name = "paymentableGenerator", strategy = "uuid")
	@Column(name ="ID",nullable=true,precision=50,length=100)
	public java.lang.String getId(){
		return this.id;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  编号
	 */
	public void setId(java.lang.String id){
		this.id = id;
	}
}
