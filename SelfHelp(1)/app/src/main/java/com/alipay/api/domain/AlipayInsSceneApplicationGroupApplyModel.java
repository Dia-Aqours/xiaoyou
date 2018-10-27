/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import com.alipay.api.internal.mapping.ApiListField;
/*   6:    */ import java.util.List;

/*   7:    */
/*   8:    */ public class AlipayInsSceneApplicationGroupApplyModel
/*   9:    */   extends AlipayObject
/*  10:    */ {
/*  11:    */   private static final long serialVersionUID = 7248312894449967916L;
/*  12:    */   @ApiField("addressee")
/*  13:    */   private InsAddressee addressee;
/*  14:    */   @ApiField("applicant")
/*  15:    */   private InsPerson applicant;
/*  16:    */   @ApiListField("applications")
/*  17:    */   @ApiField("ins_application")
/*  18:    */   private List<InsApplication> applications;
/*  19:    */   @ApiField("bill_title")
/*  20:    */   private String billTitle;
/*  21:    */   @ApiField("out_biz_no")
/*  22:    */   private String outBizNo;
/*  23:    */   @ApiField("prod_code")
/*  24:    */   private String prodCode;
/*  25:    */   @ApiField("source")
/*  26:    */   private String source;
/*  27:    */   
/*  28:    */   public InsAddressee getAddressee()
/*  29:    */   {
/*  30: 63 */     return this.addressee;
/*  31:    */   }
/*  32:    */   
/*  33:    */   public void setAddressee(InsAddressee addressee)
/*  34:    */   {
/*  35: 66 */     this.addressee = addressee;
/*  36:    */   }
/*  37:    */   
/*  38:    */   public InsPerson getApplicant()
/*  39:    */   {
/*  40: 70 */     return this.applicant;
/*  41:    */   }
/*  42:    */   
/*  43:    */   public void setApplicant(InsPerson applicant)
/*  44:    */   {
/*  45: 73 */     this.applicant = applicant;
/*  46:    */   }
/*  47:    */   
/*  48:    */   public List<InsApplication> getApplications()
/*  49:    */   {
/*  50: 77 */     return this.applications;
/*  51:    */   }
/*  52:    */   
/*  53:    */   public void setApplications(List<InsApplication> applications)
/*  54:    */   {
/*  55: 80 */     this.applications = applications;
/*  56:    */   }
/*  57:    */   
/*  58:    */   public String getBillTitle()
/*  59:    */   {
/*  60: 84 */     return this.billTitle;
/*  61:    */   }
/*  62:    */   
/*  63:    */   public void setBillTitle(String billTitle)
/*  64:    */   {
/*  65: 87 */     this.billTitle = billTitle;
/*  66:    */   }
/*  67:    */   
/*  68:    */   public String getOutBizNo()
/*  69:    */   {
/*  70: 91 */     return this.outBizNo;
/*  71:    */   }
/*  72:    */   
/*  73:    */   public void setOutBizNo(String outBizNo)
/*  74:    */   {
/*  75: 94 */     this.outBizNo = outBizNo;
/*  76:    */   }
/*  77:    */   
/*  78:    */   public String getProdCode()
/*  79:    */   {
/*  80: 98 */     return this.prodCode;
/*  81:    */   }
/*  82:    */   
/*  83:    */   public void setProdCode(String prodCode)
/*  84:    */   {
/*  85:101 */     this.prodCode = prodCode;
/*  86:    */   }
/*  87:    */   
/*  88:    */   public String getSource()
/*  89:    */   {
/*  90:105 */     return this.source;
/*  91:    */   }
/*  92:    */   
/*  93:    */   public void setSource(String source)
/*  94:    */   {
/*  95:108 */     this.source = source;
/*  96:    */   }
/*  97:    */ }



/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\

 * Qualified Name:     com.alipay.api.domain.AlipayInsSceneApplicationGroupApplyModel

 * JD-Core Version:    0.7.0.1

 */