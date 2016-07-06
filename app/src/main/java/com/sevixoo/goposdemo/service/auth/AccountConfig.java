package com.sevixoo.goposdemo.service.auth;

import android.content.Context;

import com.sevixoo.goposdemo.R;
/**
 * Created by Seweryn on 2016-07-06.
 */
public class AccountConfig {

    private final String    TOKEN_TYPE_CATEGORY;
    private final String    TOKEN_LABEL_CATEGORY;

    private Context         mContext;

    public AccountConfig(Context context) {
        this.mContext = context;
        TOKEN_TYPE_CATEGORY = context.getString( R.string.config_category_token_type );
        TOKEN_LABEL_CATEGORY = context.getString( R.string.config_category_token_type );
    }

    public String getCategoryTokenType(){
        return TOKEN_TYPE_CATEGORY;
    }

    public String getCategoryTokenLabel(){
        return TOKEN_LABEL_CATEGORY;
    }

    public boolean authTokenTypeExists( String type ){
        return type.equals(TOKEN_TYPE_CATEGORY);
    }

}
