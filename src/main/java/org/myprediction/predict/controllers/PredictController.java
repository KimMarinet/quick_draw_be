package org.myprediction.predict.controllers;

import lombok.RequiredArgsConstructor;
import org.myprediction.predict.services.PredictService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/quickdraw/predict")
@CrossOrigin(origins="*")
public class PredictController {

    private final PredictService service;

    @PostMapping
    public List<String[]> predict(@RequestPart("image") MultipartFile image) {
        return service.process(image);
    }
}
