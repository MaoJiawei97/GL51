package gl51.service.Impl

import gl51.data.Picture
import gl51.service.FiligraneService
import gl51.service.PictureService
import gl51.service.PictureThumbnailService

import javax.inject.Singleton

@Singleton
class PictureThumbnailServiceImpl implements PictureThumbnailService{

    @Override
    Picture generateThumbnail(){
        Picture pic = pictureService.fetchPicture()
        //resize pictureFile

        pictureFiligrane.apllyFiligrane(pic.getPictureFile())
        pic.setPixels_x(50)
        pic.setPixels_y(50)
        return(pic)
    }
}
