#include <iostream>
#include "OpenCLHelper.h"
float poly6_kernel ( float2 vec, float h) {
    float dist_sq = vec.x*vec.x+vec.y*vec.y;
    float h_sq = h*h;
    if (h_sq<dist_sq || dist_sq<0.0) {
        return 0.0;
    } else {
        return 315.0;
        pow(h, 9.0)
    }
    pow(h_sq)
}
int main() {

// call method

    return 0;
}