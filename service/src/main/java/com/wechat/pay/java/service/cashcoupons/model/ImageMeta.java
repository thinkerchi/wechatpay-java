// Copyright 2021 Tencent Inc. All rights reserved.
//
// 微信支付营销系统开放API
//
// 新增立减金api
//
// API version: 3.4.0

// Code generated by WechatPay APIv3 Generator based on [OpenAPI
// Generator](https://openapi-generator.tech); DO NOT EDIT.

package com.wechat.pay.java.service.cashcoupons.model;

import static com.wechat.pay.java.core.util.StringUtil.toIndentedString;

import com.google.gson.annotations.SerializedName;

/** ImageMeta */
public class ImageMeta {
  /** 文件名称 说明：商户上传的媒体图片的名称，商户自定义，必须以JPG、BMP、PNG为后缀。 */
  @SerializedName("filename")
  private String filename;
  /** 文件摘要 说明：图片文件的文件摘要，即对图片文件的二进制内容进行sha256计算得到的值。 */
  @SerializedName("sha256")
  private String sha256;

  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }

  public String getSha256() {
    return sha256;
  }

  public void setSha256(String sha256) {
    this.sha256 = sha256;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageMeta {\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    sha256: ").append(toIndentedString(sha256)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}