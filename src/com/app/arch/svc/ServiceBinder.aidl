package com.app.arch.svc;

import com.app.arch.svc.AppCursor;

interface ServiceBinder {

    int getPid();

    AppCursor dbQuery(String uri, in String[] projection, String selection, in String[] selectionArgs, String sortOrder);

    void dbInsert();

    void dbUpdate();

    void dbDelete();

    void nwDownload();

    int nwUpload(String file, String url);
}
