package com.giveu.contract.bean.fn.general.resp;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import java.io.Serializable;

/**
 * 描述: 
 * author: xiexiangyi
 * date: 2019-09-12
 */
@TableName("cs_credit")
public class CsCredit implements Serializable {


    private static final long serialVersionUID = 1L;
    @TableId(value="id", type= IdType.AUTO)
    private Double id;

    /**
     * 合同号
     */
    private Double contractNo;

    /**
     * 申请日期
     */
    private Date appDate;

    /**
     * 放款日期
     */
    private Date loanDate;

    /**
     * 合同状态(15)
     */
    private String status;

    private Date updateTime;

    private String updateIp;

    /**
     * 产品ID,关联Product表
     */
    private Double idProduct;

    /**
     * 贷款金额
     */
    private Double creditAmount;

    /**
     * 首付
     */
    private Double initPay;

    /**
     * 商品价格
     */
    private Double price;

    /**
     * 门店ID,关联sellerplace表
     */
    private Double idSellerplace;

    /**
     * 销售代表ID,关联dafy_oa.sys_user_list表
     */
    private Double idSa;

    /**
     * 内部代码 1-暗示好客户    3-暗示不好的客户
     */
    private String interCode;

    /**
     * 合同类别,来自product表   SS-消费贷;   SC-现金贷
     */
    private String creditType;

    private Double idPerson;

    /**
     * 销售代表备注
     */
    private String saComments;

    /**
     * 未使用
     */
    private String reason;

    /**
     * 提交时间
     */
    private Date commitTime;

    /**
     * 月还款额
     */
    private Double annuity;

    /**
     * 注册时间
     */
    private Date regTime;

    /**
     * 通过时间
     */
    private Date approveTime;

    /**
     * 是否移动门店  0-否;    1-是
     */
    private Double shop;

    /**
     * 下次催收日期
     */
    private Date collectionDate;

    /**
     * 决策流程ID
     */
    private Double wfiId;

    /**
     * 决策风险组
     */
    private Double riskGroup;

    /**
     * 延迟时间
     */
    private Double delayMinutes;

    /**
     * 决策流程时间
     */
    private Date wfiTime;

    /**
     * 决策分支
     */
    private Double branchId;

    private String fLog;

    /**
     * 是否走决策引擎
     */
    private Double decisionFlag;

    private Double updateUser;

    /**
     * 短代码
     */
    private String shortcode;

    /**
     * 扣款时间
     */
    private Date deductDate;

    /**
     * 合同模式
     */
    private String creditModel;

    /**
     * 0-未Hold单    1-正在Holding
     */
    private Double holdingFlag;

    /**
     * 0-未运行；  1-已运行
     */
    private Double creditInsuranceFlag;

    /**
     * PDF1文件路径
     */
    private String pdfFile1;

    /**
     * PDF2文件路径
     */
    private String pdfFile2;

    private Date createTime;

    /**
     * 权益包选项  0-未购买  1-基础版  2-升级版  9-取消
     */
    private Double powerFlag;

    /**
     * 权益包费用（按月收费）
     */
    private Double powerFee;

    /**
     * 海尔进件状态
     */
    private Double hairUploadFlag;

    /**
     * 转资金方的本金
     */
    private Double lastAmout;

    /**
     * 纠错备注
     */
    private String modifyComments;

    /**
     * 0-等额本息    1-到期还本付息
     */
    private Double p2pRepaymentStyle;

    /**
     * 合同审核阶段划分
     */
    private Double auditStage;

    private Double ramNumber;

    private Double version;

    /**
     * 决策随机线程数
     */
    private Double decisionRandom;

    /**
     * 产品还款方式 0-等额本息；1-前低后高
     */
    private Double repayStyle;

    /**
     * 对应新决策系统的WorkFlow表的主键
     */
    private String workflowGuid;

    /**
     * 无纸化系统:合同签字类别
     */
    private String signType;

    /**
     * 生成合同时的IP
     */
    private String createIp;

    /**
     * 支付金额
     */
    private Double payAmount;

    /**
     * 活动ID
     */
    private Double activeId;

    /**
     * 是否分期  0=》分期 1=》不分期
     */
    private Double isInstalments;

    /**
     * 客户消费主表ID
     */
    private Double consumerRecordsId;

    /**
     * 广西联通 月服务费率
     */
    private Double gxServiceRate;

    /**
     * 广西联通 前置咨询费率
     */
    private Double gxQzFeerate;

    /**
     * 广西联通 前置咨询费
     */
    private Double gxQzFee;

    /**
     * 保险费用
     */
    private Double insuranceFee;

    /**
     * 经度 原生的(gps)
     */
    private String latitude;

    private String longitude;

    /**
     * 免还大礼包费用(手Q项目新增 包含手机延保)
     */
    private Double accidentInsuranceFee;

    /**
     * PDF批次号
     */
    private String batchno;

    /**
     * 免还大礼包费用标示 0:未购买；1：已购买；2：已取消；3：已使用；4：已恢复
     */
    private Double accidentInsuranceFlag;

    /**
     * 数据来源渠道 1-即有钱包，2-腾讯QQ导流,3-微信导流,
4-X钱包用户　,5-爱用钱包APP,6-滴滴信用付,
7-滴滴滴水贷,8-零花钱额度合并,9-爱用钱包微信端,
10,微信绑定
11.中移项目用户数据
20-即有钱包零花钱补充身份证资料虚拟合同,50-56888渠道
     */
    private Double creditSource;

    /**
     * 数据来源 默认 GIVEU=>即有渠道,QIAKE=>洽客渠道
     */
    private String creditChannel;

    /**
     * 百宝箱标识 0-未购买； 1-已购买；2-取消
     */
    private Double treasureBoxFlag;

    /**
     * 百宝箱费用
     */
    private Double treasureBoxFee;

    /**
     * 百宝箱套餐
     */
    private Double treasureBoxPackage;

    /**
     * 增值服务提前定额收取
     */
    private Double downpaymentFee;

    /**
     * 代扣策略
     */
    private String checkoffChannel;

    /**
     * 预审内部代码
     */
    private String paInterCode;

    /**
     * 预审销售代表备注
     */
    private String paSaComments;

    /**
     * 商户放款优先级
     */
    private Double loanPriority;

    /**
     * 华北小贷征信授权PDF批次号
     */
    private String hbxdBatchno;

    /**
     * 流程类型：CREDIT_PA=>即有宝预审流程
     */
    private String processType;

    /**
     * 服务费前置收取标识：1=>百宝箱及人身意外险，2=>百宝箱
     */
    private Double prepayFlag;

    /**
     * 办单手机型号
     */
    private String phoneModel;

    /**
     * 办单的系统版本
     */
    private String orderPlatformVersion;

    /**
     * 主体识别,DF-前海达飞；FB-深圳风豹
     */
    private String ownerCode;

    /**
     * 1.表示一手单 2表示二手单
     */
    private Double creditLevel;

    /**
     * 试算编号(飞贷)
     */
    private String mistakeNo;

    /**
     * 是否资金路由；0：不路由，1：路由
     */
    private String fundRoute;

    /**
     * 资金路由次数
     */
    private Double fundRouteNum;

    public Double getId() {
	return id;
    }

    public void setId(Double id) {
        this.id = id;
    }
    public Double getContractNo() {
	return contractNo;
    }

    public void setContractNo(Double contractNo) {
        this.contractNo = contractNo;
    }
    public Date getAppDate() {
	return appDate;
    }

    public void setAppDate(Date appDate) {
        this.appDate = appDate;
    }
    public Date getLoanDate() {
	return loanDate;
    }

    public void setLoanDate(Date loanDate) {
        this.loanDate = loanDate;
    }
    public String getStatus() {
	return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public Date getUpdateTime() {
	return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
    public String getUpdateIp() {
	return updateIp;
    }

    public void setUpdateIp(String updateIp) {
        this.updateIp = updateIp;
    }
    public Double getIdProduct() {
	return idProduct;
    }

    public void setIdProduct(Double idProduct) {
        this.idProduct = idProduct;
    }
    public Double getCreditAmount() {
	return creditAmount;
    }

    public void setCreditAmount(Double creditAmount) {
        this.creditAmount = creditAmount;
    }
    public Double getInitPay() {
	return initPay;
    }

    public void setInitPay(Double initPay) {
        this.initPay = initPay;
    }
    public Double getPrice() {
	return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    public Double getIdSellerplace() {
	return idSellerplace;
    }

    public void setIdSellerplace(Double idSellerplace) {
        this.idSellerplace = idSellerplace;
    }
    public Double getIdSa() {
	return idSa;
    }

    public void setIdSa(Double idSa) {
        this.idSa = idSa;
    }
    public String getInterCode() {
	return interCode;
    }

    public void setInterCode(String interCode) {
        this.interCode = interCode;
    }
    public String getCreditType() {
	return creditType;
    }

    public void setCreditType(String creditType) {
        this.creditType = creditType;
    }
    public Double getIdPerson() {
	return idPerson;
    }

    public void setIdPerson(Double idPerson) {
        this.idPerson = idPerson;
    }
    public String getSaComments() {
	return saComments;
    }

    public void setSaComments(String saComments) {
        this.saComments = saComments;
    }
    public String getReason() {
	return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
    public Date getCommitTime() {
	return commitTime;
    }

    public void setCommitTime(Date commitTime) {
        this.commitTime = commitTime;
    }
    public Double getAnnuity() {
	return annuity;
    }

    public void setAnnuity(Double annuity) {
        this.annuity = annuity;
    }
    public Date getRegTime() {
	return regTime;
    }

    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }
    public Date getApproveTime() {
	return approveTime;
    }

    public void setApproveTime(Date approveTime) {
        this.approveTime = approveTime;
    }
    public Double getShop() {
	return shop;
    }

    public void setShop(Double shop) {
        this.shop = shop;
    }
    public Date getCollectionDate() {
	return collectionDate;
    }

    public void setCollectionDate(Date collectionDate) {
        this.collectionDate = collectionDate;
    }
    public Double getWfiId() {
	return wfiId;
    }

    public void setWfiId(Double wfiId) {
        this.wfiId = wfiId;
    }
    public Double getRiskGroup() {
	return riskGroup;
    }

    public void setRiskGroup(Double riskGroup) {
        this.riskGroup = riskGroup;
    }
    public Double getDelayMinutes() {
	return delayMinutes;
    }

    public void setDelayMinutes(Double delayMinutes) {
        this.delayMinutes = delayMinutes;
    }
    public Date getWfiTime() {
	return wfiTime;
    }

    public void setWfiTime(Date wfiTime) {
        this.wfiTime = wfiTime;
    }
    public Double getBranchId() {
	return branchId;
    }

    public void setBranchId(Double branchId) {
        this.branchId = branchId;
    }
    public String getFLog() {
	return fLog;
    }

    public void setFLog(String fLog) {
        this.fLog = fLog;
    }
    public Double getDecisionFlag() {
	return decisionFlag;
    }

    public void setDecisionFlag(Double decisionFlag) {
        this.decisionFlag = decisionFlag;
    }
    public Double getUpdateUser() {
	return updateUser;
    }

    public void setUpdateUser(Double updateUser) {
        this.updateUser = updateUser;
    }
    public String getShortcode() {
	return shortcode;
    }

    public void setShortcode(String shortcode) {
        this.shortcode = shortcode;
    }
    public Date getDeductDate() {
	return deductDate;
    }

    public void setDeductDate(Date deductDate) {
        this.deductDate = deductDate;
    }
    public String getCreditModel() {
	return creditModel;
    }

    public void setCreditModel(String creditModel) {
        this.creditModel = creditModel;
    }
    public Double getHoldingFlag() {
	return holdingFlag;
    }

    public void setHoldingFlag(Double holdingFlag) {
        this.holdingFlag = holdingFlag;
    }
    public Double getCreditInsuranceFlag() {
	return creditInsuranceFlag;
    }

    public void setCreditInsuranceFlag(Double creditInsuranceFlag) {
        this.creditInsuranceFlag = creditInsuranceFlag;
    }
    public String getPdfFile1() {
	return pdfFile1;
    }

    public void setPdfFile1(String pdfFile1) {
        this.pdfFile1 = pdfFile1;
    }
    public String getPdfFile2() {
	return pdfFile2;
    }

    public void setPdfFile2(String pdfFile2) {
        this.pdfFile2 = pdfFile2;
    }
    public Date getCreateTime() {
	return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    public Double getPowerFlag() {
	return powerFlag;
    }

    public void setPowerFlag(Double powerFlag) {
        this.powerFlag = powerFlag;
    }
    public Double getPowerFee() {
	return powerFee;
    }

    public void setPowerFee(Double powerFee) {
        this.powerFee = powerFee;
    }
    public Double getHairUploadFlag() {
	return hairUploadFlag;
    }

    public void setHairUploadFlag(Double hairUploadFlag) {
        this.hairUploadFlag = hairUploadFlag;
    }
    public Double getLastAmout() {
	return lastAmout;
    }

    public void setLastAmout(Double lastAmout) {
        this.lastAmout = lastAmout;
    }
    public String getModifyComments() {
	return modifyComments;
    }

    public void setModifyComments(String modifyComments) {
        this.modifyComments = modifyComments;
    }
    public Double getP2pRepaymentStyle() {
	return p2pRepaymentStyle;
    }

    public void setP2pRepaymentStyle(Double p2pRepaymentStyle) {
        this.p2pRepaymentStyle = p2pRepaymentStyle;
    }
    public Double getAuditStage() {
	return auditStage;
    }

    public void setAuditStage(Double auditStage) {
        this.auditStage = auditStage;
    }
    public Double getRamNumber() {
	return ramNumber;
    }

    public void setRamNumber(Double ramNumber) {
        this.ramNumber = ramNumber;
    }
    public Double getVersion() {
	return version;
    }

    public void setVersion(Double version) {
        this.version = version;
    }
    public Double getDecisionRandom() {
	return decisionRandom;
    }

    public void setDecisionRandom(Double decisionRandom) {
        this.decisionRandom = decisionRandom;
    }
    public Double getRepayStyle() {
	return repayStyle;
    }

    public void setRepayStyle(Double repayStyle) {
        this.repayStyle = repayStyle;
    }
    public String getWorkflowGuid() {
	return workflowGuid;
    }

    public void setWorkflowGuid(String workflowGuid) {
        this.workflowGuid = workflowGuid;
    }
    public String getSignType() {
	return signType;
    }

    public void setSignType(String signType) {
        this.signType = signType;
    }
    public String getCreateIp() {
	return createIp;
    }

    public void setCreateIp(String createIp) {
        this.createIp = createIp;
    }
    public Double getPayAmount() {
	return payAmount;
    }

    public void setPayAmount(Double payAmount) {
        this.payAmount = payAmount;
    }
    public Double getActiveId() {
	return activeId;
    }

    public void setActiveId(Double activeId) {
        this.activeId = activeId;
    }
    public Double getIsInstalments() {
	return isInstalments;
    }

    public void setIsInstalments(Double isInstalments) {
        this.isInstalments = isInstalments;
    }
    public Double getConsumerRecordsId() {
	return consumerRecordsId;
    }

    public void setConsumerRecordsId(Double consumerRecordsId) {
        this.consumerRecordsId = consumerRecordsId;
    }
    public Double getGxServiceRate() {
	return gxServiceRate;
    }

    public void setGxServiceRate(Double gxServiceRate) {
        this.gxServiceRate = gxServiceRate;
    }
    public Double getGxQzFeerate() {
	return gxQzFeerate;
    }

    public void setGxQzFeerate(Double gxQzFeerate) {
        this.gxQzFeerate = gxQzFeerate;
    }
    public Double getGxQzFee() {
	return gxQzFee;
    }

    public void setGxQzFee(Double gxQzFee) {
        this.gxQzFee = gxQzFee;
    }
    public Double getInsuranceFee() {
	return insuranceFee;
    }

    public void setInsuranceFee(Double insuranceFee) {
        this.insuranceFee = insuranceFee;
    }
    public String getLatitude() {
	return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }
    public String getLongitude() {
	return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
    public Double getAccidentInsuranceFee() {
	return accidentInsuranceFee;
    }

    public void setAccidentInsuranceFee(Double accidentInsuranceFee) {
        this.accidentInsuranceFee = accidentInsuranceFee;
    }
    public String getBatchno() {
	return batchno;
    }

    public void setBatchno(String batchno) {
        this.batchno = batchno;
    }
    public Double getAccidentInsuranceFlag() {
	return accidentInsuranceFlag;
    }

    public void setAccidentInsuranceFlag(Double accidentInsuranceFlag) {
        this.accidentInsuranceFlag = accidentInsuranceFlag;
    }
    public Double getCreditSource() {
	return creditSource;
    }

    public void setCreditSource(Double creditSource) {
        this.creditSource = creditSource;
    }
    public String getCreditChannel() {
	return creditChannel;
    }

    public void setCreditChannel(String creditChannel) {
        this.creditChannel = creditChannel;
    }
    public Double getTreasureBoxFlag() {
	return treasureBoxFlag;
    }

    public void setTreasureBoxFlag(Double treasureBoxFlag) {
        this.treasureBoxFlag = treasureBoxFlag;
    }
    public Double getTreasureBoxFee() {
	return treasureBoxFee;
    }

    public void setTreasureBoxFee(Double treasureBoxFee) {
        this.treasureBoxFee = treasureBoxFee;
    }
    public Double getTreasureBoxPackage() {
	return treasureBoxPackage;
    }

    public void setTreasureBoxPackage(Double treasureBoxPackage) {
        this.treasureBoxPackage = treasureBoxPackage;
    }
    public Double getDownpaymentFee() {
	return downpaymentFee;
    }

    public void setDownpaymentFee(Double downpaymentFee) {
        this.downpaymentFee = downpaymentFee;
    }
    public String getCheckoffChannel() {
	return checkoffChannel;
    }

    public void setCheckoffChannel(String checkoffChannel) {
        this.checkoffChannel = checkoffChannel;
    }
    public String getPaInterCode() {
	return paInterCode;
    }

    public void setPaInterCode(String paInterCode) {
        this.paInterCode = paInterCode;
    }
    public String getPaSaComments() {
	return paSaComments;
    }

    public void setPaSaComments(String paSaComments) {
        this.paSaComments = paSaComments;
    }
    public Double getLoanPriority() {
	return loanPriority;
    }

    public void setLoanPriority(Double loanPriority) {
        this.loanPriority = loanPriority;
    }
    public String getHbxdBatchno() {
	return hbxdBatchno;
    }

    public void setHbxdBatchno(String hbxdBatchno) {
        this.hbxdBatchno = hbxdBatchno;
    }
    public String getProcessType() {
	return processType;
    }

    public void setProcessType(String processType) {
        this.processType = processType;
    }
    public Double getPrepayFlag() {
	return prepayFlag;
    }

    public void setPrepayFlag(Double prepayFlag) {
        this.prepayFlag = prepayFlag;
    }
    public String getPhoneModel() {
	return phoneModel;
    }

    public void setPhoneModel(String phoneModel) {
        this.phoneModel = phoneModel;
    }
    public String getOrderPlatformVersion() {
	return orderPlatformVersion;
    }

    public void setOrderPlatformVersion(String orderPlatformVersion) {
        this.orderPlatformVersion = orderPlatformVersion;
    }
    public String getOwnerCode() {
	return ownerCode;
    }

    public void setOwnerCode(String ownerCode) {
        this.ownerCode = ownerCode;
    }
    public Double getCreditLevel() {
	return creditLevel;
    }

    public void setCreditLevel(Double creditLevel) {
        this.creditLevel = creditLevel;
    }
    public String getMistakeNo() {
	return mistakeNo;
    }

    public void setMistakeNo(String mistakeNo) {
        this.mistakeNo = mistakeNo;
    }
    public String getFundRoute() {
	return fundRoute;
    }

    public void setFundRoute(String fundRoute) {
        this.fundRoute = fundRoute;
    }
    public Double getFundRouteNum() {
	return fundRouteNum;
    }

    public void setFundRouteNum(Double fundRouteNum) {
        this.fundRouteNum = fundRouteNum;
    }
}