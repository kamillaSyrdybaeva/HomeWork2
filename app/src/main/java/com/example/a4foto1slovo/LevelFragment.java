package com.example.a4foto1slovo;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.a4foto1slovo.databinding.FragmentLevelBinding;

public class LevelFragment extends Fragment {

    FragmentLevelBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentLevelBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.btnFirstLevel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("firstImage", "https://w7.pngwing.com/pngs/941/980/png-transparent-death-grim-s-cartoon-fictional-character-reaper.png");
                bundle.putString("secondImage", "https://thumbs.dreamstime.com/b/%D0%BA%D0%BE%D1%81%D0%B0-%D0%B4%D0%BB%D1%8F-%D0%BA%D0%BE%D1%81%D1%8F-%D1%82%D1%80%D0%B0%D0%B2%D1%8B-%D0%B8%D0%B7%D0%BE%D0%BB%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%BD%D0%B0%D1%8F-%D0%BD%D0%B0-%D0%B1%D0%B5%D0%BB%D0%BE%D0%B9-%D0%BF%D1%80%D0%B5%D0%B4%D0%BF%D0%BE%D1%81%D1%8B%D0%BB%D0%BA%D0%B5-108961289.jpg");
                bundle.putString("thirdImage", "https://n1s1.hsmedia.ru/41/32/fa/4132fa01d4281d297a6b30eb745ea9e7/480x600_1_7661b47c30bd8cbf26521498d55fad20@1080x1350_0xac120003_1373514831640100058.jpeg");
                bundle.putString("fourImage", "https://total.kz/storage/ba/ba0acb96dcad8b65792c9ea04640e75a_resize_w_830_h_465.jpg");
                bundle.putString("answer", "коса");
                bundle.putString("prompt", "то чем косят косят траву");
                bundle.putString("changeLevel","Level number 1");
                GameFragment gameFragment = new GameFragment();
                gameFragment.setArguments(bundle);

                requireActivity().getSupportFragmentManager().beginTransaction().replace(
                        R.id.main_activity, gameFragment).commit();
            }
        });

        binding.btnSecondLevel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("firstImage", "https://cdn1.flamp.ru/b18b3ab33ae06e52a968481498a4ee31.png");
                bundle.putString("secondImage", "https://i.artfile.ru/1280x1024_161638_[www.ArtFile.ru].jpg");
                bundle.putString("thirdImage", "https://3dnews.ru/assets/external/illustrations/2015/04/09/912420/Annular_eclipse_-ring_of_fire-.jpg");
                bundle.putString("fourImage", "https://s1.1zoom.ru/big3/220/Stars_Sky_Night_446830.jpg");
                bundle.putString("answer", "луна");
                bundle.putString("prompt", "то что на небе ночью");
                bundle.putString("changeLevel","Level number 2");
                GameFragment gameFragment = new GameFragment();
                gameFragment.setArguments(bundle);

                requireActivity().getSupportFragmentManager().beginTransaction().replace(
                        R.id.main_activity, gameFragment).commit();
            }
        });

        binding.btnThreeLevel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("firstImage", "https://mebel-v-nsk.ru/wp-content/uploads/b/2/3/b231a57d60a6d1392123c7a83d17726c.jpe");
                bundle.putString("secondImage", "https://i.pinimg.com/originals/f6/66/e1/f666e1303c36216a065c37eea039ab92.jpg");
                bundle.putString("thirdImage", "https://ladyneeds.ru/wp-content/uploads/2021/01/45-9.jpg");
                bundle.putString("fourImage", "https://multikidlyadetei.ru/wp-content/uploads/2020/03/siniy-traktor-siniy-traktor-most.jpg");
                bundle.putString("answer", "синий");
                bundle.putString("prompt", "какой-то холодный цвет");
                bundle.putString("changeLevel","Level number 3");
                GameFragment gameFragment = new GameFragment();
                gameFragment.setArguments(bundle);

                requireActivity().getSupportFragmentManager().beginTransaction().replace(
                        R.id.main_activity, gameFragment).commit();
            }
        });
    }
}