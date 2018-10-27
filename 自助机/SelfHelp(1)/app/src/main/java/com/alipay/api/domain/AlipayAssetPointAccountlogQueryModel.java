/*   1:    */ package com.alipay.api.domain;
/*   2:    */ 
/*   3:    */ import com.alipay.api.AlipayObject;
/*   4:    */ import com.alipay.api.internal.mapping.ApiField;
/*   5:    */ import com.alipay.api.internal.mapping.ApiListField;
/*   6:    */ import java.util.Date;
/*   7:    */ import java.util.List;
/*   8:    */ 
/*   9:    */ public class AlipayAssetPointAccountlogQueryModel
/*  10:    */   extends AlipayObject
/*  11:    */ {
/*  12:    */   private static final long serialVersionUID = 5427527417432318377L;
/*  13:    */   @ApiField("account_date_begin")
/*  14:    */   private Date accountDateBegin;
/*  15:    */   @ApiField("account_date_end")
/*  16:    */   private Date accountDateEnd;
/*  17:    */   @ApiField("page_number")
/*  18:    */   private Long pageNumber;
/*  19:    */   @ApiField("page_size")
/*  20:    */   private Long pageSize;
/*  21:    */   @ApiListField("sub_trans_code")
/*  22:    */   @ApiField("string")
/*  23:    */   private List<String> subTransCode;
/*  24:    */   @ApiListField("trans_code")
/*  25:    */   @ApiField("string")
/*  26:    */   private List<String> transCode;
/*  27:    */   @ApiField("user_symbol")
/*  28:    */   private String userSymbol;
/*  29:    */   @ApiField("user_symbol_type")
/*  30:    */   private String userSymbolType;
/*  31:    */   
/*  32:    */   public Date getAccountDateBegin()
/*  33:    */   {
/*  34: 73 */     return this.accountDateBegin;
/*  35:    */   }
/*  36:    */   
/*  37:    */   public void setAccountDateBegin(Date accountDateBegin)
/*  38:    */   {
/*  39: 76 */     this.accountDateBegin = accountDateBegin;
/*  40:    */   }
/*  41:    */   
/*  42:    */   public Date getAccountDateEnd()
/*  43:    */   {
/*  44: 80 */     return this.accountDateEnd;
/*  45:    */   }
/*  46:    */   
/*  47:    */   public void setAccountDateEnd(Date accountDateEnd)
/*  48:    */   {
/*  49: 83 */     this.accountDateEnd = accountDateEnd;
/*  50:    */   }
/*  51:    */   
/*  52:    */   public Long getPageNumber()
/*  53:    */   {
/*  54: 87 */     return this.pageNumber;
/*  55:    */   }
/*  56:    */   
/*  57:    */   public void setPageNumber(Long pageNumber)
/*  58:    */   {
/*  59: 90 */     this.pageNumber = pageNumber;
/*  60:    */   }
/*  61:    */   
/*  62:    */   public Long getPageSize()
/*  63:    */   {
/*  64: 94 */     return this.pageSize;
/*  65:    */   }
/*  66:    */   
/*  67:    */   public void setPageSize(Long pageSize)
/*  68:    */   {
/*  69: 97 */     this.pageSize = pageSize;
/*  70:    */   }
/*  71:    */   
/*  72:    */   public List<String> getSubTransCode()
/*  73:    */   {
/*  74:101 */     return this.subTransCode;
/*  75:    */   }
/*  76:    */   
/*  77:    */   public void setSubTransCode(List<String> subTransCode)
/*  78:    */   {
/*  79:104 */     this.subTransCode = subTransCode;
/*  80:    */   }
/*  81:    */   
/*  82:    */   public List<String> getTransCode()
/*  83:    */   {
/*  84:108 */     return this.transCode;
/*  85:    */   }
/*  86:    */   
/*  87:    */   public void setTransCode(List<String> transCode)
/*  88:    */   {
/*  89:111 */     this.transCode = transCode;
/*  90:    */   }
/*  91:    */   
/*  92:    */   public String getUserSymbol()
/*  93:    */   {
/*  94:115 */     return this.userSymbol;
/*  95:    */   }
/*  96:    */   
/*  97:    */   public void setUserSymbol(String userSymbol)
/*  98:    */   {
/*  99:118 */     this.userSymbol = userSymbol;
/* 100:    */   }
/* 101:    */   
/* 102:    */   public String getUserSymbolType()
/* 103:    */   {
/* 104:122 */     return this.userSymbolType;
/* 105:    */   }
/* 106:    */   
/* 107:    */   public void setUserSymbolType(String userSymbolType)
/* 108:    */   {
/* 109:125 */     this.userSymbolType = userSymbolType;
/* 110:    */   }
/* 111:    */ }


/* Location:           D:\zhifubao\编译jar包\alipay-sdk-java20161213173952\
 * Qualified Name:     com.alipay.api.domain.AlipayAssetPointAccountlogQueryModel
 * JD-Core Version:    0.7.0.1
 */