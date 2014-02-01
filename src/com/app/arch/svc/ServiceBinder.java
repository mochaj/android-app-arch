package com.app.arch.svc;

import android.os.RemoteException;
import android.os.Process;

public class ServiceBinder extends IServiceBinder.Stub {

    @Override
    public int getPid() throws RemoteException {
        return Process.myPid();
    }

    @Override
    public AppCursor dbQuery(String uri, String[] projection, String selection,
            String[] selectionArgs, String sortOrder) throws RemoteException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void dbInsert() throws RemoteException {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void dbUpdate() throws RemoteException {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void dbDelete() throws RemoteException {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void nwDownload() throws RemoteException {
        // TODO Auto-generated method stub
        
    }

    @Override
    public int nwUpload(String file, String url) throws RemoteException {
        // TODO Auto-generated method stub
        return 0;
    }
}
