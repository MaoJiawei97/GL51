package gl51.service.Impl

import gl51.data.Picture
import gl51.service.PictureCloudTransferService
import gl51.service.PictureDbUpdateService
import gl51.service.PictureService



class PictureDbUpdateServiceImpl implements PictureDbUpdateService{


    @Override
    int updateDb(){
        Picture pic = pictureService.fetchPicture()

    }
}
