package gl51.service.Impl

import gl51.data.Picture
import gl51.service.PictureResizeService
import gl51.service.PictureService



class PictureResizeServiceImpl implements PictureResizeService { //implement interface

    @Override
    Picture resize(){
        Picture pic = pictureService.fetchPicture()
        pic.setPixels_x(1024)
        pic.setPixels_y(1024)
        pic.setPictureFile()
        return pic
    }
}
