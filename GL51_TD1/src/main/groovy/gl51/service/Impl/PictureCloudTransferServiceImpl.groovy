package gl51.service.Impl

import gl51.data.Picture
import gl51.service.PictureCloudTransferService
import gl51.service.PictureResizeService
import gl51.service.PictureThumbnailService

import javax.inject.Singleton

@Singleton
class PictureCloudTransfertServiceImpl implements PictureCloudTransferService{



    @Override
    int transfer(){

        Picture pic, thumbnail
        thumbnail = thumbnailService.makeThumbnail()
        pic = resizeService.resize()

    }

}
