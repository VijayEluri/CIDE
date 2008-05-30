#ifndef StorageDevice_h__included
#define StorageDevice_h__included

//Layer OS.Windows

#line 1 "C:/workspace/FAME/FAMEDB/src/OS/Windows/StorageDevice.h"
/*
*  14.02.2008 Wei Tao <weitaoly@msn.com>: Initial version 
*/

#include "include.h"




#line 8 "C:/workspace/FAME/FAMEDB/src/OS/Windows/StorageDevice.h"
class StorageDevice
{
//**** Layer OS.Windows ****
private:
#line 9 "C:/workspace/FAME/FAMEDB/src/OS/Windows/StorageDevice.h"

 
 private:
    FILE * pFile;
    
 public:
 
    static const size_t BLOCK_SIZE = PAGE_SIZE;
 
 public:

    StorageDevice()
    {
       // printf("\nStoreage Device Windows Constructor");
        pFile = NULL;
    }
    
    bool Create(const char * filename)
    {
        if(IsOpen())
        {
            debug_print("\nERROR in StorageDevice.Create(): Device is still open!");
            return false;
        }    
        
        pFile = fopen(filename, "w+b");
        return (pFile!=NULL);        
    }
    
    bool Open(const char * filename)
    {
        if(IsOpen())
        {
            debug_print("\nERROR in StorageDevice.Open(): Device is already open!");
            return false;
        }   
        
        pFile = fopen(filename, "r+b");

        return (pFile!=NULL);
    }
    
    bool IsOpen()
    {
        return (pFile!=NULL);
    }
    
    void Close()
    {
        if(IsOpen()) 
        {
        	debug_print("\n\n\n\n\nclosing database >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n\n\n\n\n");
            fclose(pFile);
            pFile = NULL;
        }
    }
    
    bool AllocNewBlock()
    {
        if(!IsOpen())
        {
            debug_print("\nERROR in StorageDevice.AllocNewBlock(): Device is closed!");
            return false;
        }   
    
        if(0 != fseek(pFile, 0, SEEK_END))
        {
            debug_print("\nERROR in StorageDevice.AllocNewBlock(): Failed to seek to end of file \n");
            return false;
        }
        
        byte buffer[BLOCK_SIZE] = {0};
        if (0 >= fwrite(buffer, BLOCK_SIZE, 1, pFile))
        {
            debug_print("\nERROR in StorageDevice.AllocNewBlock(): Failed to write new block \n");
            return false;        
        }
        
        return true;        
    }
    
    bool ReadBlock(BID bid, byte buffer[])
    {
        if(!IsOpen())
        {
            debug_print("\nERROR in StorageDevice.ReadBlock(): Device is closed!");
            return false;
        }
        
        if(bid==EMPTY_BLOCK || buffer==NULL)
        {
            debug_print2("\nERROR in StorageDevice.ReadBlock(): Invalid params! bid=%u, buffer=%X\n", bid, (unsigned int)buffer);
            return false;
        }
        
        const size_t offset = (bid-1)*BLOCK_SIZE;
        
        if(0 != fseek(pFile, offset, SEEK_SET))
        {
            debug_print1("\nERROR in StorageDevice.ReadBlock(): Failed to seek to %u \n", offset);
            return false;
        }
        
		const size_t bytes_read = fread(buffer, 1, BLOCK_SIZE, pFile);
        if (bytes_read != BLOCK_SIZE)
        {
			debug_print2("\nERROR in StorageDevice.ReadBlock(): Failed to read block %u, bytes read: %u \n", bid, bytes_read);
            return false;        
        }
		
		debug_print3("\nREADBLOCK bid: %u; %.2X %.2X \n", bid, buffer[0], buffer[1]);
        
        return true;
    }
    
    bool WriteBlock(BID bid, const byte buffer[])
    {
        
        if(!IsOpen())
        {
            debug_print("\nERROR in StorageDevice.WriteBlock(): Device is closed!");
            return false;
        }
        
        if(bid==EMPTY_BLOCK || buffer==NULL)
        {
            debug_print2("\nERROR in StorageDevice.WriteBlock(): Invalid params! bid=%u, buffer=%X\n", bid, (unsigned int)buffer);
            return false;
        }
		
		debug_print3("\nWRITEBLOCK bid: %u; %.2X %.2X \n", bid, buffer[0], buffer[1]);
        
        const size_t offset = (bid-1)*BLOCK_SIZE;
        
        if(0 != fseek(pFile, offset, SEEK_SET))
        {
            debug_print1("\nERROR in StorageDevice.WriteBlock(): Failed to seek to %u \n", offset);
            return false;
        }
        
        if (0 >= fwrite(buffer, BLOCK_SIZE, 1, pFile))
        {
            debug_print1("\nERROR in StorageDevice.WriteBlock(): Failed to write block %u \n", bid);
            return false;        
        }
        
        return true; 
    }

#line 157 "C:/workspace/FAME/FAMEDB/src/OS/Windows/StorageDevice.h"
};
#endif //StorageDevice_h__included

